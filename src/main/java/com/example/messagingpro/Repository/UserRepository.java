package com.example.messagingpro.Repository;

import com.example.messagingpro.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
