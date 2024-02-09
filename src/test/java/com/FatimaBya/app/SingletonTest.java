package com.FatimaBya.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


   

public class SingletonTest {

    @Test
    public void testSingletonInstance() {
        
        Singleton instance1 = Singleton.getInstance();

        Singleton instance2 = Singleton.getInstance();

        assertSame(instance1, instance2);
    }
}




