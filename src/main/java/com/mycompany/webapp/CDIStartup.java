/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webapp;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;

/**
 *
 * @author EGLOBAL
 */
public class CDIStartup {

    public void postConstruct(@Observes @Initialized(ApplicationScoped.class) Object o) {
        System.out.println("Eager initialization");
    }
    
}
