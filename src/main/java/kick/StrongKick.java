package kick;

import lotr.Character;

public class StrongKick implements KickStrategy{
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        whoIsKicked.setHp(whoIsKicked.getHp()-whoKick.getPower());
        System.out.println("Try what my sword tastes like");
    }
}
