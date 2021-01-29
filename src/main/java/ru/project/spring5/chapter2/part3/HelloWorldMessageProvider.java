package ru.project.spring5.chapter2.part3;

public class HelloWorldMessageProvider  implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello world!";
    }
}
