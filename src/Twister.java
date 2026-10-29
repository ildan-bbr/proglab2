import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;

public final class Twister extends SpecialMove {
    public Twister(){
        super(Type.DRAGON, 40, 1.0);
    }
    @Override
    protected String describe() {
        return "применяет Twister";
    }
    @Override
    protected void applyOppEffects(Pokemon opponent){
        if (Math.random()<0.3) {
            Effect.flinch(opponent);
        }

    }
}
