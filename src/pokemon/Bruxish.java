package pokemon;

import ru.ifmo.se.pokemon.*;
import yep.*;

public class Bruxish extends Pokemon {

    public Bruxish (String name, int lvl){

        super(name, lvl);
        this.setStats(68, 105, 70, 70, 70, 92);
        this.setType(Type.WATER, Type.PSYCHIC);
        this.setMove(new XScissor(), new Thunder(), new SwordsDance(), new WillOWisp());

    }
}
