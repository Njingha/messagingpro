package com.example.messagingpro.Entity;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Builder
public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id_Conversation")
    private Long idConversation;
    @Column(name = "Nom_Conversation")
    private String nomConversation;

    public Conversation() {
    }

    public Conversation(long idConversation, String nomConversation) {
        this.idConversation = idConversation;
        this.nomConversation = nomConversation;
    }

    public Long getIdConversation() {
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
                ", nomConversation='" + nomConversation +
                '}';
    }
}
