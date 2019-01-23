/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 *
 * @author Ali Hassan
 */
public class Card {

    private String suit;
    private int value;

    public Card(String s, int v) {
        suit = s;
        value = v;

        if (s.equals("Heart") || s.equals("Spades") || s.equals("Diamonds") || s.equals("Clubs")) {
            System.out.println("The parameters are valus");
        } else {
            System.out.println("The suir is invalid"
                    + "Choose a valid Option : Heart, Spades , Clubs, Diamonds");
        }

        if (v > 0 && v < 14) {
            System.out.println("The card value is valid");

        } else {
            System.out.println("Choose valid card value between1 - 13");
        }
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {

        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

}
