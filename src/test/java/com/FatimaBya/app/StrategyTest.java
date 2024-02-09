package com.FatimaBya.app;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StrategyTest {

    @Test
    public void testConcreteStrategyA() {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());

        // Vérifier que le comportement de execute() est conforme à l'attendu
        assertDoesNotThrow(() -> context.executeStrategy());
    }

    @Test
    public void testConcreteStrategyB() {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyB());

        // Vérifier que le comportement de execute() est conforme à l'attendu
        assertDoesNotThrow(() -> context.executeStrategy());
    }

    @Test
    public void testChangeStrategy() {
        Context context = new Context();
        ConcreteStrategyA strategyA = new ConcreteStrategyA();
        ConcreteStrategyB strategyB = new ConcreteStrategyB();

        // Appliquer la stratégie A
        context.setStrategy(strategyA);
        assertDoesNotThrow(() -> context.executeStrategy());

        // Changer la stratégie à B
        context.setStrategy(strategyB);
        assertDoesNotThrow(() -> context.executeStrategy());
    }
}


