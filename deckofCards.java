package com.oracletutorials;

public class deckofCards {
    private static playingCard[] cards;

    public static playingCard[] getCards() {
        return cards;
    }

    public static void setCards(playingCard[] cards) {
        deckofCards.cards = cards;
    }
}
