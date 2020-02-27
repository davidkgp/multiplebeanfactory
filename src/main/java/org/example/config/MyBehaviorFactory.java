package org.example.config;

import org.example.multiple.MyBehavior;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyBehaviorFactory {

    @Autowired
    ApplicationContext applicationContext;

    public MyBehavior getBehavior(String behaviorName) {
        return applicationContext.getBeansOfType(MyBehavior.class).get(behaviorName);

    }
}
