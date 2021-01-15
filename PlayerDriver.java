package com.playerdeck;

public class PlayerDriver {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.createDeck();
        deck.shuffle();
        deck.drawing();
        deck.playCard();

    }
}
