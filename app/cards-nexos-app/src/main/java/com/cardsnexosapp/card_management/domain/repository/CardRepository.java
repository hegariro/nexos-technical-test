package com.cardsnexosapp.cards_management.domain.repository;

import com.cardsnexosapp.cards_management.domain.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
    // Puedes agregar métodos personalizados aquí si es necesario
}

