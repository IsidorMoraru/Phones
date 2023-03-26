package org.example;

import java.util.ArrayList;
import java.util.List;

public class Message {
    public String messageContent;

    public Message(String messageContent) {
        this.messageContent = messageContent;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageContent='" + messageContent + '\'' +
                '}';
    }
}