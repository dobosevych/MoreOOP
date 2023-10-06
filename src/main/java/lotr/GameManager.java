package lotr;

import java.util.Scanner;

public class GameManager {
    public static void fight(Character c1, Character c2){
            System.out.println("First character currently is "  + c1);
            System.out.println("Second character currently is " + c2);
        while (c1.isAlive() && c2.isAlive()){
            c1.kick(c2);
            c2.kick(c1);
            System.out.println("First character now is " + c1);
            System.out.println("Second character now is " + c2);
            if (c1.isAlive() && c2.isAlive()){
                System.out.println("Would you like to continue the fight?");
                System.out.println("Write 'Yes' or 'No'");
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();
                while (!(input.equals("Yes")) && !(input.equals("yes")) && !(input.equals("no")) && !(input.equals("No"))){
                    System.out.println("Try again, you can write 'Yes' or 'No'");
                    input = sc.nextLine();
                }
                if (input.equals("Yes") || input.equals("yes")){
                    continue;
                }else{
                    break;
                }
            }
        }
        System.out.println("The game has finished");
    }
}
