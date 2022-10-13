package pokemon;

import ru.ifmo.se.pokemon.*;
import yep.*;

public class Mantyke extends Pokemon {

    public Mantyke (String name, int lvl){

        super(name, lvl);
        this.setStats(45, 20, 50, 60, 120, 50);
        this.setType(Type.WATER, Type.FLYING);
        this.setMove(new TakeDown(), new DoubleTeam(), new Supersonic());

    }

}
