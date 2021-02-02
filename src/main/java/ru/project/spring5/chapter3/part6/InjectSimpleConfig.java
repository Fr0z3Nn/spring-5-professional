package ru.project.spring5.chapter3.part6;

import org.springframework.stereotype.Component;

@Component("injectSimpleConfig")
public class InjectSimpleConfig {
    public String getName() {
        return "John";
    }

    public int getAge() {
        return 30;
    }

    public float getHeight() {
        return 1.4F;
    }

    public boolean isProgrammer() {
        return false;
    }

    public Long getAgeInSeconds() {
        return 1_124_325_124L;
    }
}
