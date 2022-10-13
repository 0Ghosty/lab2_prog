package yep;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {

    public ShadowBall(){ super(Type.GHOST, 80, 1); }

    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.2) {
            p.addEffect(new Effect().chance(0.25).stat(Stat.SPECIAL_ATTACK, -1));
        }

    }

    protected String describe(){ return "Использует Shadow Ball"; }

}
