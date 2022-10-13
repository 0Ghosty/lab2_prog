package yep;

import ru.ifmo.se.pokemon.*;

public class MudBomb extends SpecialMove {

    public MudBomb(){ super(Type.GROUND, 65, 0.85); }

    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().chance(0.3).stat(Stat.ACCURACY, -1));
    }

    protected String describe(){ return "Использует Mud Bomb"; }

}