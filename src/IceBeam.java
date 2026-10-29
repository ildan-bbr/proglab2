import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Status;

public final class IceBeam extends SpecialMove {
    public IceBeam(){
        super(Type.ICE, 90, 1.0);
    }
    @Override
    protected String describe(){
        return "применяет IceBeam";
    }
    @Override
    protected void applyOppEffects(Pokemon opponent){
        if (opponent.getCondition()==Status.NORMAL){
            if (Math.random()<0.1){
                Effect.freeze(opponent);
            }
        }
    }
}
