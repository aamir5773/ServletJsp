package com.lti.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener {

    
    public MySessionListener() {
    }


    public void sessionCreated(HttpSessionEvent arg0)  { 
    	System.out.println("Session Created");
    }

	
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	System.out.println("--------Sessiondestroyed");

    }
	
}
