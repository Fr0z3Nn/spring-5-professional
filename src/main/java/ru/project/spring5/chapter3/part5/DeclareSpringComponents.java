package ru.project.spring5.chapter3.part5;

import org.springframework.context.support.GenericXmlApplicationContext;
import ru.project.spring5.chapter2.part3.MessageRenderer;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("/app-context-annotation.xml");
        //ctx.load("/app-context.xml");
        ctx.refresh();
        MessageRenderer messageRenderer = ctx.getBean("renderer", MessageRenderer.class);
        messageRenderer.render();
        ctx.close();
    }
}
