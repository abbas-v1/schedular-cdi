/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webapp;

import java.util.concurrent.TimeUnit;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.enterprise.concurrent.ManagedScheduledExecutorService;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author EGLOBAL
 */
@ApplicationScoped
public class CdiClass {

    @Resource
    private ManagedScheduledExecutorService managedScheduledExecutorService;
    
    private final Runnable task = () -> repeatedTask();
    
    public void onGet() {
        managedScheduledExecutorService.scheduleAtFixedRate(
                task, 0, 2, TimeUnit.SECONDS);
    }
    
    private void repeatedTask() {
        System.out.println("My work...");
    }

}
