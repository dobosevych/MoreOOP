package ua.edu.ucu.lab4;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("GAME STARTS");

        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " kicks " + c2.getClass().getSimpleName());
            c1.kick(c2);
            System.out.println("After kick: " + c2);
            if (!c2.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " is dead!");
                System.out.println("THE WINNER: " + c1.getClass().getSimpleName());
                System.out.println("GAME END");
                break;
            }

            System.out.println(c2.getClass().getSimpleName() + " kicks " + c1.getClass().getSimpleName());
            c2.kick(c1);
            System.out.println("After kick: " + c1);
            if (!c1.isAlive()) {
                System.out.println(c1.getClass().getSimpleName() + " is dead!");
                System.out.println("THE WINNER: " + c2.getClass().getSimpleName());
                System.out.println("GAME END");
                break;
            }
        }
    }
}
