package com.example.messagingpro.Entity;

import jakarta.persistence.*;

public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id_Message;

    @Column(name = "Envoyeur_Message")
    private String envoyeurMessage;
    @Column(name = "Receveur_Message")
    private String receveurMessage;

    @ManyToOne
    @Column(name = "Id_Conversation")
    private Conversation Conversation;

    public Long getId_Message() {
        return Id_Message;
    }

    public void setId_Message(Long id_Message) {
        Id_Message = id_Message;
    }

    public String getEnvoyeurMessage() {
        return envoyeurMessage;
    }

    public void setEnvoyeurMessage(String envoyeurMessage) {
        this.envoyeurMessage = envoyeurMessage;
    }

    public String getReceveurMessage() {
        return receveurMessage;
    }

    public void setReceveurMessage(String receveurMessage) {
        this.receveurMessage = receveurMessage;
    }

    public com.example.messagingpro.Entity.Conversation getConversation() {
        return Conversation;
    }

    public void setConversation(com.example.messagingpro.Entity.Conversation conversation) {
        Conversation = conversation;
    }

    public Message(Long id_Message, String envoyeurMessage, String receveurMessage, com.example.messagingpro.Entity.Conversation conversation) {
        Id_Message = id_Message;
        this.envoyeurMessage = envoyeurMessage;
        this.receveurMessage = receveurMessage;
        Conversation = conversation;
    }

    @Override
    public String toString() {
        return "Message{" +
                "Id_Message=" + Id_Message +
                ", envoyeurMessage='" + envoyeurMessage + '\'' +
                ", receveurMessage='" + receveurMessage + '\'' +
                ", Conversation=" + Conversation +
                '}';
    }
}
