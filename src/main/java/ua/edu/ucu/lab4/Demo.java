package ua.edu.ucu.lab4;
import java.lang.reflect.InvocationTargetException;

public class Demo {
    public static void main(String args[])
        throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException{
            Character c1 = CharacterFactory.createRandomCharacterWithReflection();
            Character c2 = CharacterFactory.createRandomCharacterWithReflection();

            GameManager manager = new GameManager();
            manager.fight(c1, c2);
    }
}
