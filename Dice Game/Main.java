package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numOfPlayers;
        int numOfCubes;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of players: ");
        numOfPlayers = in.nextInt();

        System.out.println("Enter number of cubes: ");
        numOfCubes = in.nextInt();

        Game game = new Game(numOfPlayers, numOfCubes);
        game.startGame();

        /* OUTPUT:

        Enter number of players:
        3
        Enter number of cubes:
        4
        Enter your name and names of players
        Mike
        Bob

        Round number 1 has started
        Player Mike gets 15 points
        Player Bob gets 13 points
        Player Computer gets 11 points
        Winner(s) of this round: Mike: 15 points
        End of round number 1


        Round number 2 has started
        Player Mike gets 18 points
        Player Bob gets 13 points
        Player Computer gets 11 points
        Winner(s) of this round: Mike: 18 points
        End of round number 2


        Round number 3 has started
        Player Mike gets 19 points
        Player Bob gets 17 points
        Player Computer gets 11 points
        Winner(s) of this round: Mike: 19 points
        End of round number 3


        Round number 4 has started
        Player Mike gets 16 points
        Player Bob gets 13 points
        Player Computer gets 11 points
        Winner(s) of this round: Mike: 16 points
        End of round number 4


        Round number 5 has started
        Player Mike gets 11 points
        Player Bob gets 16 points
        Player Computer gets 10 points
        Winner(s) of this round: Bob: 16 points
        End of round number 5


        Round number 6 has started
        Player Bob gets 15 points
        Player Mike gets 14 points
        Player Computer gets 10 points
        Winner(s) of this round: Bob: 15 points
        End of round number 6


        Round number 7 has started
        Player Bob gets 12 points
        Player Mike gets 12 points
        Player Computer gets 15 points
        Winner(s) of this round: Computer: 15 points
        End of round number 7


        Round number 8 has started
        Player Computer gets 14 points
        Player Bob gets 14 points
        Player Mike gets 5 points
        Winner(s) of this round: Computer: 14 points
        Bob: 14 points
        End of round number 8


        Round number 9 has started
        Player Computer gets 10 points
        Player Bob gets 15 points
        Player Mike gets 15 points
        Winner(s) of this round: Bob: 15 points
        Mike: 15 points
        End of round number 9


        Round number 10 has started
        Player Bob gets 8 points
        Player Mike gets 15 points
        Player Computer gets 14 points
        Winner(s) of this round: Mike: 15 points
        End of round number 10


        Round number 11 has started
        Player Mike gets 11 points
        Player Computer gets 16 points
        Player Bob gets 8 points
        Winner(s) of this round: Computer: 16 points
        End of round number 11


        Round number 12 has started
        Player Computer gets 14 points
        Player Mike gets 17 points
        Player Bob gets 13 points
        Winner(s) of this round: Mike: 17 points
        End of round number 12

        Absolute Winner: Mike
        Game finished!

         */

    }
}


