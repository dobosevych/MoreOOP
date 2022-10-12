package lotr;
import java.util.Random;
import kick.NobleKick;

class Nobel extends Character {
    private static final Random random = new Random();
    public Nobel(int power1, int power2, int hp1, int hp2) {
        super(random.nextInt(power2 - power1) + power1,
                random.nextInt(hp2 - hp1) + hp1, new NobleKick());
    }
}
