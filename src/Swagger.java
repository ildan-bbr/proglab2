import ru.ifmo.se.pokemon.*;
public final class Swagger extends StatusMove{
    public Swagger(){
        super(Type.NORMAL,0,0.85);
    }
    @Override
    protected String describe() {
        return "Применяет Swagger";
    }
    @Override
    protected void applyOppEffects(Pokemon opponent){
        opponent.setMod(Stat.ATTACK, 2);
        Effect.confuse(opponent);
    }
}