package kick;

import lotr.Character;

public class DeathKick implements KickStrategy{
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        if (whoKick.getPower() > whoIsKicked.getPower()){
            whoIsKicked.setHp(0);
        }else{
            whoIsKicked.setPower(whoIsKicked.getPower()-1);
        }
        System.out.println("It's everything or nothing");
    }
}
