package yep;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {

    public Thunder() { super(Type.ELECTRIC, 110, 70); }

    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.30) {
            Effect.paralyze(p);
        }
    }
    protected String describe() { return "Использует Thunder"; }
}
