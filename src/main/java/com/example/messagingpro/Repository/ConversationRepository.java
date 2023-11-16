package com.example.messagingpro.Repository;

import com.example.messagingpro.Entity.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversationRepository extends JpaRepository <Conversation, Long> {
}
