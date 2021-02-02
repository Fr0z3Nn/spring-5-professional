package ru.project.spring5.chapter3.part5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.project.spring5.chapter2.part3.MessageProvider;
import ru.project.spring5.chapter2.part3.MessageRenderer;

@Service("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    @Override
    public void render() {
        if(messageProvider == null){
            throw new RuntimeException("Установите свой месседж провайдер");
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    @Autowired
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
