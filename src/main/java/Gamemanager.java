package lotr;
public class GameManager{
    public static void  fight (Character c1, Character c2){
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("The character  " + c1.getClass().getSimpleName() + " and " + "character " + c2.getClass().getSimpleName() + " are fighting now");
            c1.kick(c2);
            if (c1.isAlive() && !(c2.isAlive())) {
                System.out.println("The character " + c1.getClass().getSimpleName() + " won!");
                break;
            } else if (c2.isAlive() && !(c1.isAlive())) {
                System.out.println("The character " + c2.getClass().getSimpleName() + " won!");
                break;
            } else if (c1.getClass().equals(c2.getClass())) {
                System.out.println("It is a draw");
                break;
            }
        }
    }

    public void main() throws InstantiationException, IllegalAccessException {
        Character character1 = new CharacterFactory().createCharacter();
        Character character2 = new CharacterFactory().createCharacter();
        System.out.println("The game started");
        this.fight(character1, character2);

    }
}