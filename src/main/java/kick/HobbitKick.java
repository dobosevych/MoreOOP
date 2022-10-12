package kick;

import lotr.Character;
import lotr.Hobbit;

public class HobbitKick implements BasicKick{
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        int power = whoKick.getPower();
        whoKick.setPower(power - 1);
    }
    public  void toCry() {
        System.out.println("I am crying");
    }
}
