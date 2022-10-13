package yep;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {

    public RockTomb() { super(Type.ROCK, 60, 0.95); }

    protected void	applyOppEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.SPEED, -1));
    }

    protected String describe() { return "Использует Rock Tomb"; }

}
