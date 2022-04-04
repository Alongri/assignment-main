package com.sony.assignment.actions;

import com.sony.assignment.actions.dialogs.add.CalcAddAction;
import com.sony.assignment.actions.dialogs.add.JoinStringAction;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class ActionsContainer {

    private Collection<Action> actions;

    public ActionsContainer(){
        this.actions = Set.of(new LogTestAction(),new DelayAction(5),new DelayAction(3), new DelayAction(1),
                              new CalcAddAction(), new RandomNumberAction(), new ListNumbersAction(), new JoinStringAction());
    }

    public Collection<String> getActions(){
        return this.actions.stream().map(Action::getName).collect(Collectors.toSet());
    }

    public void runAction(String name){
        actions.stream().filter(a -> a.getName().equals(name)).findFirst().ifPresent(a -> a.invoke());
    }

}
