import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public final class Porygon extends Pokemon{
    public Porygon(String name, int level){
        super(name,level);
        setType(Type.NORMAL);
        setStats(65,60,70,85,75,40);
        addMove(new SandAttack());
        addMove(new Overheat());
        addMove(new Swagger());
    }
}
