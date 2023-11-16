package com.example.messagingpro.Entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "Id_User")
    private Long Id_User;
    @Column(name = "Pseudo_User")
    private String pseudo ;
    @Column(name = "Prenom_User")
    private String prenomUser ;
    @Column(name = "Nom_User")
    private String nomUser;
    @Column(name = "Email_User")
    private String emailUser;
    @Column(name = "Password_User")
    private String Password_User;
    @Column(name = "Image_User")
    private String image_User;

    public User() {
    }

    public long getIdUser() {
        return Id_User;
    }

    public void setIdUser(long idUser) {
        this.Id_User = idUser;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPrenomUser() {
        return prenomUser;
    }

    public void setPrenomUser(String prenomUser) {
        this.prenomUser = prenomUser;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getPassword_User() {
        return Password_User;
    }

    public void setPassword_User(String password_User) {
        Password_User = password_User;
    }

    public String getImage_User() {
        return image_User;
    }

    public void setImage_User(String image_User) {
        this.image_User = image_User;
    }


    public User(long Id_User, String pseudo, String prenomUser, String nomUser, String emailUser, String password_User, String image_User) {
        this.Id_User = Id_User;
        this.pseudo = pseudo;
        this.prenomUser = prenomUser;
        this.nomUser = nomUser;
        this.emailUser = emailUser;
        Password_User = password_User;
        this.image_User = image_User;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + Id_User +
                ", pseudo='" + pseudo + '\'' +
                ", prenomUser='" + prenomUser + '\'' +
                ", nomUser='" + nomUser + '\'' +
                ", emailUser='" + emailUser + '\'' +
                ", Password_User='" + Password_User + '\'' +
                ", image_User='" + image_User + '\'' +
                '}';
    }
}


