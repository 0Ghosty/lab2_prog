package yep;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {

    public DoubleTeam() { super(Type.NORMAL, 0, 1); }

    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.25).stat(Stat.EVASION, +6));
    }

    protected String describe() { return "Использует Double Team"; }

}