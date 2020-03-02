package com.epam.LoggersTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static Logger LOGGER = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        Test test = new Test();
    	test.takeInput();
    	HouseConstructionCost cost = new HouseConstructionCost();
    	cost.estimation();
    }
}