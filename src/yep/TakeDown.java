package yep;

import ru.ifmo.se.pokemon.*;

public class TakeDown extends PhysicalMove {

    public TakeDown() { super(Type.NORMAL, 90, 0.85); }

    public void applySelfDamage(Pokemon p, double att) {
        p.setMod(Stat.HP, (int)Math.round(att / 4.0));
    }

    protected String describe() { return ("Использует Take Down"); }

}
