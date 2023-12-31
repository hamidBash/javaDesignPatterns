package CreationalDesignPattern.abstractfactorypattern;

import jdk.jshell.execution.LoaderDelegate;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("BANK"))
            return new BankFactory();
        else if(choice.equalsIgnoreCase("LOAN"))
            return new LoanFactory();
        return null;
    }
}
