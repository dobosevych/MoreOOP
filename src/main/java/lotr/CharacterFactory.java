package lotr;
import org.reflections.Reflections;

import java.util.Random;
import java.util.Set;

public class CharacterFactory {
    public static Character createCharacter() throws InstantiationException, IllegalAccessException {
        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends Character>> subTypes =
                reflections.getSubTypesOf(Character.class);
        Class cls = (Class) subTypes.toArray()[new Random().nextInt(subTypes.size())];
    return (Character) cls.newInstance();
    }
}
