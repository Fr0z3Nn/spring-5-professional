package ru.project.spring5.chapter2.part3;

import org.apache.log4j.or.jms.MessageRenderer;

public class HelloWorldDecoupled {
    public static void main(String[] args) {
        MessageRender mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
