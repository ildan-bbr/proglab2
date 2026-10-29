import ru.ifmo.se.pokemon.*;
public final class Meowth extends Pokemon{
    public Meowth(String name, int level){
        super(name,level);
        setType(Type.NORMAL);
        setStats(40,45,35,40,40,90);
        addMove(new Overheat());
        addMove(new Rest());
        addMove(new Twister());
    }
}
