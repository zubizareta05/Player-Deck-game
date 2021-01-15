package com.playerdeck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Deck extends Card{
    private int deckSize = deck.length;
    private List<String> playerHand = new ArrayList<String>();


    public void createDeck() {

        for (int i = 0; i < deckSize; i++) {
                deck[i] = rank[i%13] + suit[i/13];
            }
    }


    public void shuffle()
    {
        String temp;
        for(int start = 0; start < deckSize; start++){
            int index = (int)(Math.random() * deckSize);
            temp = deck[start];
            deck[start] = deck[index];
            deck[index] = temp;
        }

        /*for(String u: deck){
            System.out.println(u);
        }*/ //if you want to view your shuffled cards
    }

    public void discard() {
        if (deckSize == 0) {
            System.out.println("There are no more cards in the deck, Do you want to play again?");
            Scanner sn = new Scanner(System.in);
            String response = sn.nextLine();
            if(response.equals("yes")){
                playerHand.clear();
                restart();
            }
            else if(response.equals("no")){
                System.out.println("Thank you for playing this game!");
                playerHand.clear();
                System.exit(0);
            }
        }
        else{
            playerHand.clear();
            drawing();
        }
    }

    public void restart(){
        Deck deck = new Deck();
        deck.createDeck();
        deck.shuffle();
        deck.drawing();
        deck.playCard();

    }

    public void drawing() {
        shuffle();
        playCard();

    }

    public void playCard(){
        System.out.println("Draw your cards!");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

            for (int j = 0; j < num; j++) {
                playerHand.add(deck[j]);
            }
            System.out.println("You have " + playerHand + " in your hand");
            deckSize -= num;
            discard();
    }

}
