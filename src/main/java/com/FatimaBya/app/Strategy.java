package com.FatimaBya.app;

public interface Strategy {

        void execute();

}

class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("Exécution de la stratégie A");
        
    }
}
class ConcreteStrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("Exécution de la stratégie B");
       
    }

}


