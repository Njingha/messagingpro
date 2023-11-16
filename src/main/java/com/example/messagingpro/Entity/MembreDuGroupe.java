package com.example.messagingpro.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Set;

 //Annotation Lambok qui permet de créer automatiquement les Getters et Setters
@Entity
public class MembreDuGroupe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAssociation;

    @ManyToOne
    @JoinColumn(name = "Id_User")
    private User users;

    @ManyToOne
    @JoinColumn(name = "Id_Conversation")
    private Conversation conversation;

    // utilisation du type java.date.sql pour manipuler les dates de la base de données
    @Column(name = "Date_Ajout")
    private Date dateAjout;
    @Column(name = "Date_Abdiction")
    private Date dateAbdiction;

     public MembreDuGroupe() {
     }

     public Long getIdAssociation() {
         return idAssociation;
     }

     public void setIdAssociation(Long idAssociation) {
         this.idAssociation = idAssociation;
     }

     public User getUser() {
         return users;
     }

     public void setUser(User user) {
         this.users = users;
     }

     public Conversation getConversation() {
         return conversation;
     }

     public void setConversation(Conversation conversation) {
         this.conversation = conversation;
     }

     public Date getDateAjout() {
         return dateAjout;
     }

     public void setDateAjout(Date dateAjout) {
         this.dateAjout = dateAjout;
     }

     public Date getDateAbdiction() {
         return dateAbdiction;
     }

     public void setDateAbdiction(Date dateAbdiction) {
         this.dateAbdiction = dateAbdiction;
     }

     public MembreDuGroupe(Long idAssociation, User users, Conversation conversation, Date dateAjout, Date dateAbdiction) {
         this.idAssociation = idAssociation;
         this.users = users;
         this.conversation = conversation;
         this.dateAjout = dateAjout;
         this.dateAbdiction = dateAbdiction;
     }

     @Override
     public String toString() {
         return "MembreDuGroupe{" +
                 "idAssociation=" + idAssociation +
                 ", user=" + users +
                 ", conversation=" + conversation +
                 ", dateAjout=" + dateAjout +
                 ", dateAbdiction=" + dateAbdiction +
                 '}';
     }
 }
