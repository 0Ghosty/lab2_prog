package yep;

import ru.ifmo.se.pokemon.*;

public class SwordsDance extends SpecialMove {

    public SwordsDance() {super(Type.NORMAL, 0, 1);}

    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.ATTACK, 2));
    }

    protected String describe() { return "Использует Swords Dance";}
}
