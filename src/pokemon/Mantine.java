package pokemon;

import ru.ifmo.se.pokemon.*;
import yep.*;

public class Mantine extends Pokemon {

    public Mantine(String name, int lvl){

        super(name, lvl);
        this.setStats(85, 40, 70, 80, 140, 70);
        this.setType(Type.WATER, Type.FLYING);
        this.setMove(new TakeDown(), new DoubleTeam(), new Supersonic(), new RockTomb());

    }
}