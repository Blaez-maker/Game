package game;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;



public class Game {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        System.out.println("You are at a 4-way crossroads. Enter 1, 2, 3, or 4");

        choice = in.nextInt();

        if (choice <= 4 && choice > 0) {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 4 + 1);
            choice = randomNum;

        }
        switch (choice) {
            case 1:
                choice = 1;
                System.out.println("You walk down a narrow corridor big enough for a man but no bigger. It occurs to you that this is strange as you live in a world with many fantastic creatures such as dwarves, dragons, dryads. As you probe this train of thought much further than the subject deserves you walk into a pitfall trap full of spikes. As you breathe your last you cannot help but notice the fine craftsdwarfship of the trap itself. And of course you should. It is a dwarven work. Ded");
                break;
            case 2:
                choice = 2;
                System.out.println("You chose to go down the path to the south. it's very tiny and cramped and you wonder why you're literally forcing yourself into this ever shrinking path. You decide to go back but it seems the way you came shrank. You cannot move. Ded");
                break;
            case 3:
                choice = 3;
                break;
            case 4:
                choice = 4;
                System.out.println("You clearly see the sunlight as you walk out of the dungeon as you walk back to town you ponder why you even consider any other direction. Good end.");
                break;
            default:
                System.out.println("Ded");

        }
        
        if(choice == 3){
            System.out.println();
            Room myRoom = new Room(choice);
            
            
        }
    }

}
