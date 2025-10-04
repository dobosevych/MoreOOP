package ua.edu.ucu.lab4.strategy;
import ua.edu.ucu.lab4.Character;

public class HobbitKickStrategy extends KickStrategy{

    @Override
    public void kick(Character main, Character enemy) {
        toCry();
    }

    private void toCry() {
        System.out.println("Cry a lot");
    }
}
