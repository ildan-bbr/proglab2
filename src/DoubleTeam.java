import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Pokemon;

public final class DoubleTeam extends StatusMove{
    public DoubleTeam() {
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected String describe () {return "применяет DoubleTeam";}
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION, 1);
    }
    @Override
    protected boolean checkAccuracy(Pokemon attacker, Pokemon defender){
        return true;
    }
}
