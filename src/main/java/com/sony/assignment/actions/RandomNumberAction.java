package com.sony.assignment.actions;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RandomNumberAction extends Action {
    Logger logger = Logger.getLogger(LogTestAction.class.getName());
    private Random rand;
    private int number;
    public RandomNumberAction(){
        this.rand = new Random();
    }
    @Override
    protected void run() {
        try {
            number = rand.nextInt(10000);
            logger.log(Level.INFO, String.format("Random number %d",this.number));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected String getName() { return String.format("RandomNumber");

    }

}
