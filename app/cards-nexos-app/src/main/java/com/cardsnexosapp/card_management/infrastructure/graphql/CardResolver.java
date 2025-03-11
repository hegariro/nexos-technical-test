package com.cardsnexosapp.cards_management.infrastructure.graphql;

import com.cardsnexosapp.cards_management.application.service.CardService;
import com.cardsnexosapp.cards_management.domain.model.Card;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CardResolver {

    private final CardService cardService;

    public CardResolver(CardService cardService) {
        this.cardService = cardService;
    }

    @MutationMapping
    public Card createCard(
            @Argument String cardNumber,
            @Argument Long ownerId,
            @Argument String expirationDate,
            @Argument String cardType) {
        return cardService.createCard(cardNumber, ownerId, expirationDate, cardType);
    }
}

