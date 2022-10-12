package lotr;
import kick.BasicKick;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import kick.BasicKick;
@AllArgsConstructor @Getter
@Setter

public  abstract  class Character{
    Character(){
    }
    @Getter @Setter
    int hp;
    @Setter @Getter
    int power;

    BasicKick  kick;

    public boolean isAlive(){
        return hp > 0;
    }
    public  void setHp(int hp){
       this.hp = Math.max(0, hp);
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + "{hp=" + this.hp + ", " + "power=" + this.power + "}";
    }

    public void kick(Character c) {
        kick.kick(this, c);
    }
}
