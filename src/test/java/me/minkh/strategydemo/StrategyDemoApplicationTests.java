package me.minkh.strategydemo;

import me.minkh.strategydemo.calc.v4.strategy.DamageCalculatorStrategy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class StrategyDemoApplicationTests {

    @Autowired
    List<DamageCalculatorStrategy> strategies;

    @Test
    void contextLoads() {
        for (DamageCalculatorStrategy strategy : strategies) {
            String name = strategy.getClass().getName();
            System.out.println(name);
        }
    }
}
