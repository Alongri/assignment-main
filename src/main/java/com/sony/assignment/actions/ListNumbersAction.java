package com.sony.assignment.actions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ListNumbersAction extends Action {
    Logger logger = Logger.getLogger(LogTestAction.class.getName());

    @Override
    protected void run() {
        try {
            String res = "";
            for (int num=1; num<=100; num++)
                res += String.format("%d ", num);
            logger.log(Level.INFO, res);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected String getName() { return String.format("ListNumbers");

    }

}
