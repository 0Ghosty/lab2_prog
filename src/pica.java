import pokemon.*;
import ru.ifmo.se.pokemon.*;

public class pica {

    public static void main(String[] args){

        Battle b = new Battle();
        b.addAlly(new Bruxish("фиксик", 5));
        b.addAlly(new Mantyke("ара", 4));
        b.addAlly(new Mantine("чубакабра", 5));
        b.addFoe(new Happiny("бебрик", 3));
        b.addFoe(new Chansey("чувачок", 5));
        b.addFoe(new Blissey("Хукси соло", 4));
        b.go();
    }
}
