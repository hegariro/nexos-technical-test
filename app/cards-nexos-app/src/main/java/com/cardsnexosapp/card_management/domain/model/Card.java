package com.cardsnexosapp.cards_management.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cards")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "card_number", nullable = false, unique = true)
    private String cardNumber;

    @Column(name = "owner_id", nullable = false)
    private Long ownerId;

    @Column(name = "expiration_date", nullable = false)
    private String expirationDate;

    @Column(name = "card_type", nullable = false)
    private String cardType;
}

