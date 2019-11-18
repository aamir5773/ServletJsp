package com.lti.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class MyApplicationListener
 *
 */
public class MyApplicationListener implements ServletContextListener {

    public MyApplicationListener() {
    }

    public void contextDestroyed(ServletContextEvent arg0)  { 
    	System.out.println("--------Contextdestroyed");
    }

	public void contextInitialized(ServletContextEvent arg0)  { 
    	System.out.println("--------ContextInitialized");

    }
	
}
