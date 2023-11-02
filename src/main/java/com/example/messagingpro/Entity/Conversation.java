package com.example.messagingpro.Entity;

import jakarta.persistence.*;

@Entity
public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id_Conversation")
    private long idConversation;
    @Column(name = "Nom Conversation")
    private String nomConversation;

    public Conversation() {
    }

    public Conversation(long idConversation, String nomConversation) {
        this.idConversation = idConversation;
        this.nomConversation = nomConversation;
    }

    public long getIdConversation() {
        return idConversation;
    }

    public void setIdConversation(long idConversation) {
        this.idConversation = idConversation;
    }

    public String getNomConversation() {
        return nomConversation;
    }

    public void setNomConversation(String nomConversation) {
        this.nomConversation = nomConversation;
    }

    @Override
    public String toString() {
        return "Conversation{" +
                "idConversation=" + idConversation +
                ", nomConversation='" + nomConversation + '\'' +
                '}';
    }
}
