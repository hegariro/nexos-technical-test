package com.cardsnexosapp.cards_management.application.service;

import com.cardsnexosapp.cards_management.domain.model.Card;
import com.cardsnexosapp.cards_management.domain.repository.CardRepository;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public Card createCard(String cardNumber, Long ownerId, String expirationDate, String cardType) {
        Card card = new Card(null, cardNumber, ownerId, expirationDate, cardType);
        return cardRepository.save(card);
    }
}

