package ru.project.spring5.chapter2.part3;

import ru.project.spring5.chapter2.part3.MessageProvider;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider messageProvider);
    MessageProvider getMessageProvider();
}
