package org.example.service;

import org.example.config.MyBehaviorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Value("${behavior.class1}")
    String behavior1;
    @Value("${behavior.class2}")
    String behavior2;


    private final MyBehaviorFactory myBehaviorFactory;

    public MyService(@Autowired MyBehaviorFactory myBehaviorFactory) {
        this.myBehaviorFactory = myBehaviorFactory;
    }

    public void getService() {
        myBehaviorFactory.getBehavior(behavior1).doingMajorWork();
    }

    public void getService2() {
        myBehaviorFactory.getBehavior(behavior2).doingMajorWork();
    }
}
