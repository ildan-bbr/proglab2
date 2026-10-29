import ru.ifmo.se.pokemon.*;
public final class Espeon extends Pokemon{
    public Espeon(String name, int level){
        super(name,level);
        setType(Type.PSYCHIC);
        setStats(65,65,60,130,95,110);
        addMove(new SandAttack());
        addMove(new Overheat());
        addMove(new Swagger());
        addMove(new Whirlpool());
    }
}
