package lotr;

import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class CharacterFactory {
    public static Character createCharacter(){
        Reflections reflections = new Reflections("lotr");
        Set<Class<?extends  Character>> charactersSet = reflections.getSubTypesOf(Character.class);
        List<Class<?extends  Character>> characters = new ArrayList<>(charactersSet);
        List<Class<?extends  Character>> characters_new = new ArrayList<>();
        for (Class<? extends Character> character : characters) {
            if (character.getName() != "lotr.Noble"){
                characters_new.add(character);
            }
        }
        try {
            return characters_new.get(new Random().nextInt(characters_new.size())).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
