/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webapp;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author abbas.muhammad
 */
@WebListener
public class Schedular implements ServletContextListener {

    private ScheduledFuture<?> scheduledFuture;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Schedular started");
        scheduledFuture = Executors.newSingleThreadScheduledExecutor()
                .scheduleAtFixedRate(
                        () -> repeatedTask(),
                        0,
                        2,
                        TimeUnit.SECONDS
                );
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Schedular destroyed");
        scheduledFuture.cancel(true);
    }

    private void repeatedTask() {
        System.out.println("My repeated work...");
    }

}
