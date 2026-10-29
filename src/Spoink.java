import ru.ifmo.se.pokemon.*;
public final class Spoink extends Pokemon {
    public Spoink(String name, int level){
        super(name,level);
        setType(Type.PSYCHIC);
        setStats(60,25,35,70,80,60);
        addMove(new Overheat());
        addMove(new Rest());
        addMove(new Twister());
        addMove(new DoubleTeam());
    }
}
