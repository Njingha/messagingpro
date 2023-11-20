package com.example.messagingpro.Repository;

import com.example.messagingpro.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
