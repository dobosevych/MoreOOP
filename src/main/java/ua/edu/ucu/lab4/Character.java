package ua.edu.ucu.lab4;

import lombok.AllArgsConstructor;
import lombok.Data;
import ua.edu.ucu.lab4.strategy.KickStrategy;

@Data
@AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;
    private KickStrategy kickStrategy;

    public boolean isAlive(){
        return hp>0;
    }

    public void kick(Character enemy) {
        kickStrategy.kick(this, enemy);
    }

    public String toString() {
        return getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }

    public void setHp(int hp) {
        if(hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }

    }
}
