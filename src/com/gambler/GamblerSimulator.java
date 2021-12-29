/*
@Author : Avinash Chauhan
@Date : 29/12/21
@Problem Statement : Gambler Simulator
*/

package com.gambler;

import java.util.Random;

public class GamblerSimulator
{
    // Initialization of variable
    public static final int stake = 100;
    public static final int bet = 1;

    // Method defined
     public static void setBet()
    {
        Random rn = new Random();
        int value = rn.nextInt(2);
        if(value == 1)
        {
            System.out.println("Bet won");

        }
        else
        {
            System.out.println("Bet loss");
        }
    }

    public static void main(String[] args)
    {
        // Welcome message added
        System.out.println("Welcome to Gambler Simulator");
        // Method called
        setBet();
    }
}
