package lotr;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "Yes";
        while (input.equals("Yes") || input.equals("yes")) {
            Character character = CharacterFactory.createCharacter();
            Character character1 = CharacterFactory.createCharacter();
            GameManager.fight(character, character1);
            System.out.println("Would you like to try this game again? Write 'Yes' or 'No'");
            input = sc.nextLine();
            while (!(input.equals("Yes")) && !(input.equals("yes")) && !(input.equals("no")) && !(input.equals("No"))) {
                System.out.println("Try again, you can write 'Yes' or 'No'");
                input = sc.nextLine();
//            }
//        }
            }
        }
        System.out.println("Bye\uD83D\uDE22");
    }
}
