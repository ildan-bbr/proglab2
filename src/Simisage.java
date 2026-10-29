import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public final class Simisage extends Pokemon{
    public Simisage(String name, int level){
        super(name, level);
        setType(Type.GRASS);
        setStats(75,98,63,98,63,101);
        addMove(new IceBeam());
        addMove(new Twister());
        addMove(new DoubleTeam());
        addMove(new Telekinesis());
    }
}
