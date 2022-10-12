package kick;
import java.util.Random;
import lotr.Character;

public class NobleKick implements BasicKick{
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        Random random = new Random();
        int feedback = random.nextInt(whoKick.getPower());
        whoIsKicked.setHp(whoIsKicked.getHp() - feedback);
    }
}
