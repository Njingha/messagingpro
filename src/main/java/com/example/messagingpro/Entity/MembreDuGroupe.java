package com.example.messagingpro.Entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MembreDuGroupe  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAssociation;
    @ManyToOne
    @JoinColumn(name = "Id_User")
    private List<User> user = new ArrayList<>() ;

    @JoinColumn(name ="Id_Conversation")
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

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
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

    public MembreDuGroupe(Long idAssociation, List<User> user, Conversation conversation, Date dateAjout, Date dateAbdiction) {
        this.idAssociation = idAssociation;
        this.user = user;
        this.conversation = conversation;
        this.dateAjout = dateAjout;
        this.dateAbdiction = dateAbdiction;
    }
}
