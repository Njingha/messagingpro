package com.example.messagingpro.Repository;

import com.example.messagingpro.Entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.*;

public interface MessageRepository extends JpaRepository <Message, Long> {
}
