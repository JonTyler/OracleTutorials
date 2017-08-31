package com.oracletutorials;

class playingCard {
    private static String Suit;
    private static String Rank;

    //constructor
     playingCard(String suit, String rank){
        setSuit(suit);
        setRank(rank);
    }

     static String getSuit() {
        return Suit;
    }

     static void setSuit(String suit) {
        Suit = suit;
    }

     static String getRank() {
        return Rank;
    }

     static void setRank(String rank) {
        Rank = rank;
    }
}