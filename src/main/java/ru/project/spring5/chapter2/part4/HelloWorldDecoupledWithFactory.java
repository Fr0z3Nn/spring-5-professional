package ru.project.spring5.chapter2.part4;

import ru.project.spring5.chapter2.part3.HelloWorldMessageProvider;
import ru.project.spring5.chapter2.part3.MessageProvider;
import ru.project.spring5.chapter2.part3.MessageRenderer;
import ru.project.spring5.chapter2.part3.StandardOutMessageRenderer;

public class HelloWorldDecoupledWithFactory {
    public static void main(String[] args) {
        MessageRenderer mr = MessageSupportFactory.getInstance().getRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
