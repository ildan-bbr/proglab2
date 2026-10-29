import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.*;
public final class Telekinesis extends StatusMove{
    public Telekinesis(){
        super(Type.PSYCHIC,0,1.0);
    }
    @Override
    protected String describe(){
        return "применяет Telekinesis";
    }
    @Override
    protected void applyOppEffects(Pokemon opponent){
        opponent.addEffect(new Effect().turns(3).stat(Stat.EVASION, -2));
    }
}