package yep;

import ru.ifmo.se.pokemon.*;

public class Supersonic extends StatusMove {

    public Supersonic() { super(Type.NORMAL, 0, 0.55); }

    protected void applyOppEffects(Pokemon p){ Effect.confuse(p); }

    protected String describe() { return "Использует Supersonic"; }

}
