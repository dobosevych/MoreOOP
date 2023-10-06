package lotr;

import kick.DeathKick;

public class Elf extends Character{
    public Elf(){
        super(10, 10, new DeathKick());
    }
}
