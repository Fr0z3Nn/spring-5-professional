package ru.project.spring5.chapter3.part5;

import org.springframework.stereotype.Component;
import ru.project.spring5.chapter2.part3.MessageProvider;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello world!";
    }
}
