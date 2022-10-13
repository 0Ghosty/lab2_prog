package yep;

import ru.ifmo.se.pokemon.*;

public class WillOWisp extends StatusMove {

    public WillOWisp() { super(Type.FIRE, 0, 0.85);}

    protected void applyOppEffects(Pokemon p) {
        Effect.burn(p);
    }

    protected String describe() { return "Использует Will-O-Wisp"; }

}
