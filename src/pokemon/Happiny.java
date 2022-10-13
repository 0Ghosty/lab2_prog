package pokemon;

import ru.ifmo.se.pokemon.*;
import yep.*;

public class Happiny extends Pokemon{
    public Happiny(String name, int lvl){

        super(name, lvl);
        this.setStats(100, 5, 5,15, 65, 30);
        this.setType(Type.NORMAL);
        this.setMove(new ShadowBall(), new DoubleTeam());

    }
}
