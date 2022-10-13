package pokemon;

import ru.ifmo.se.pokemon.*;
import yep.*;

public class Blissey extends Pokemon {

    public Blissey (String name, int lvl){

        super(name, lvl);
        this.setStats(255, 10, 10, 75, 135, 55);
        this.setType(Type.NORMAL);
        this.setMove(new ShadowBall(),new DoubleTeam(), new MudBomb());
    }
}
