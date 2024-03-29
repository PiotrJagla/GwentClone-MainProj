package com.example.demo.cardsPersistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "decks")
class DeckModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String deckname;
    private String username;

    private String fraction;


    @OneToMany(mappedBy = "deck")
    private List<CardDisplayModel> cards;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeckname() {
        return deckname;
    }

    public void setDeckname(String deckname) {
        this.deckname = deckname;
    }

    public String getFraction() {
        return fraction;
    }

    public void setFraction(String fraction) {
        this.fraction = fraction;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<CardDisplayModel> getCards() {
        return cards;
    }

    public void setCards(List<CardDisplayModel> cards) {
        this.cards = cards;
    }
}
