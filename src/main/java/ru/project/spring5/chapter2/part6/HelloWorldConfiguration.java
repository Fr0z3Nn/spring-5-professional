package ru.project.spring5.chapter2.part6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.project.spring5.chapter2.part3.HelloWorldMessageProvider;
import ru.project.spring5.chapter2.part3.MessageProvider;
import ru.project.spring5.chapter2.part3.MessageRenderer;
import ru.project.spring5.chapter2.part3.StandardOutMessageRenderer;

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public MessageProvider provider(){
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer(){
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }

}
