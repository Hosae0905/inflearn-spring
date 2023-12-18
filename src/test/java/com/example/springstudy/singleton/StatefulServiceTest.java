package com.example.springstudy.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest {
    @Test
    void statefulServiceSingleton() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService stateService1 = ac.getBean(StatefulService.class);
        StatefulService stateService2 = ac.getBean(StatefulService.class);

        int userA = stateService1.order("userA", 10000);
        int userB = stateService2.order("userB", 20000);

        System.out.println("price = " + userA);

        assertThat(userA).isNotEqualTo(20000);
    }

    static class TestConfig {

        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }
    }
}