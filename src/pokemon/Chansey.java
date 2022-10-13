package pokemon;

import ru.ifmo.se.pokemon.*;
import yep.*;

public class Chansey extends Pokemon {

    public Chansey(String name, int lvl){

        super(name, lvl);
        this.setStats(250, 5, 5, 35, 105, 50);
        this.setType(Type.NORMAL);
        this.setMove(new ShadowBall(), new DoubleTeam(), new MudBomb());
    }
}
