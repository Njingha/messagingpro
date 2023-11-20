package com.example.messagingpro;

import com.example.messagingpro.Entity.Conversation;
import com.example.messagingpro.Entity.Users;
import com.example.messagingpro.Repository.ConversationRepository;
import com.example.messagingpro.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MessagingproApplication {
	public static void main(String[] args) {
		SpringApplication.run(MessagingproApplication.class, args);
	}

	//Injection de fausse données (mock pour la base de données H2.
	@Bean
	CommandLineRunner start(UserRepository userRepository, 	ConversationRepository conversationRepository){
		return args -> {
			userRepository.save(Users.builder().pseudo("Peanut").emailUser("Noko@gmail.com").build());
			userRepository.save(Users.builder().pseudo("baka").emailUser("baka@gmail.com").build());
			userRepository.save(Users.builder().pseudo("Loko").emailUser("loko@gmail.com").build());
			userRepository.save(Users.builder().pseudo("Bankrout").emailUser("Banks@gmail.com").build());
			// Mock conversation
			conversationRepository.save(Conversation.builder().idConversation(112L).nomConversation("LoKa").build());
			conversationRepository.save(Conversation.builder().idConversation(123L).nomConversation("Peaka").build());
		};
	}
}
