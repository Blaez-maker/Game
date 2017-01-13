package game;
import java.util.Scanner;

public class Room {
    
     String r1 = "You open the first door. it leads directly to a brick wall. Try again.";
     String r2 = "You open the second door. It leads deeper inside. You keep walking.";
     String r3 = "You open the third door. It leads you in a circle back to this room somehow";
     String r4 = "You open the last door. The last thing you see is a gun rigged to be fired when the door opens. Ded";
     int roomChoice = 0;
    
    public Room(int choice){
        
        System.out.println("You're in a room with four doors. Enter 1, 2, 3, or 4 to choose one");
        
        Scanner in = new Scanner(System.in);
        choice = in.nextInt();
        roomChoice = choice;
       
        
                
        switch(roomChoice){
                case 1:
                roomChoice = 1;
                System.out.println(r1);
                break;
                
                case 2:
                roomChoice = 2;
                System.out.println(r2);
                break;
                
                case 3:
                roomChoice = 3;
                System.out.println(r3);
                break;
                
                case 4:
                roomChoice = 4;
                System.out.println(r4);
                break;
                }
  
    }
}
    
 
