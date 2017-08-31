package com.oracletutorials;

public class execute {
    public static playingCard Card = new playingCard("Spades", "Ace");
    public static void main(String[] args) {
        System.out.println(playingCard.getRank() + " of " + playingCard.getSuit());
    }
}
