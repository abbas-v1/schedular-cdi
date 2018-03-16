/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webapp;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

/**
 *
 * @author EGLOBAL
 */
@Named(value = "newJSFManagedBean")
@Dependent
public class NewJSFManagedBean {
    
    @Inject
    CdiClass cdiClass;
    
    public String myMethod() {
        cdiClass.startTask();
        return "valuing";
    }
    
}
