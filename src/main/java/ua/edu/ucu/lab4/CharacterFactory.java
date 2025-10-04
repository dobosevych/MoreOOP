package ua.edu.ucu.lab4;

import java.util.Random;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class CharacterFactory {

    private static final Random RANDOM = new Random();

    private static final List<Class<?>> classes = List.of(Hobbit.class, Elf.class, King.class, Knight.class);

    public static Character createRandomCharacterWithReflection()
        throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
            int choice = RANDOM.nextInt(classes.size());
            Class<?> characterClass = classes.get(choice);
            return (Character) characterClass.getDeclaredConstructor().newInstance();
    }
}
