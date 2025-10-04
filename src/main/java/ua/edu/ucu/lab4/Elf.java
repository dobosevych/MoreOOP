package ua.edu.ucu.lab4;

import ua.edu.ucu.lab4.strategy.ElfKickStrategy;

public class Elf extends Character{
    public Elf() {
        super(10, 10, new ElfKickStrategy());
    }


    // @Override
    // public void kick(Character character) {
    //     // System.out.println("Cry a lot");
    // }
}
