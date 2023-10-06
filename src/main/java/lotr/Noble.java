package lotr;

import kick.StrongKick;

import java.util.Random;

public class Noble extends Character{
    public  Noble(int max_hp, int min_hp, int max_power, int min_power){
        super(new Random().nextInt(max_hp-min_hp) + min_hp, new Random().nextInt(max_power-min_power) + min_power, new StrongKick());
    }
}
