package org.example.config;


import org.example.multiple.MyBehavior;
import org.example.multiple.impl.MyBehavior1;
import org.example.multiple.impl.MyBehavior2;
import org.example.multiple.impl.MyBehavior3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBehaviorConfig {

    @Bean("my1")
    public MyBehavior getBehavor1() {
        return new MyBehavior1("MyName");
    }

    @Bean("my2")
    public MyBehavior getBehavor2() {
        return new MyBehavior2(3333);
    }

    @Bean("my3")
    public MyBehavior getBehavor3() {
        return new MyBehavior3();
    }

}
