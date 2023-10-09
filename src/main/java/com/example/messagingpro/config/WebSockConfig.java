package com.example.messagingpro.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSockConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry ) {

        registry.addEndpoint("/ws-message").setAllowedOriginPatterns("*");
        //permet de se connecter à avec sockJs

    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        // reserve une memoire simple pour le message a envoyer à la destination /topic
        config.enableSimpleBroker("/topic");
        config.setApplicationDestinationPrefixes("/app");
    }
}
