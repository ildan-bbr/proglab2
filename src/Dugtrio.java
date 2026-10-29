import ru.ifmo.se.pokemon.*;
public final class Dugtrio extends Pokemon {
    public Dugtrio(String name, int level){
        super(name,level);
        setType(Type.GROUND);
        setStats(35,100,50,50,70,120);
        addMove(new Overheat());
        addMove(new Rest());
    }
}
