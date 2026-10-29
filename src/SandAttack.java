import ru.ifmo.se.pokemon.*;
public final class SandAttack extends StatusMove{
    public SandAttack() {
        super(Type.GROUND, 0, 1.0);
    }
    @Override
    protected String describe(){
        return "применяет SandAttack";
    }
    @Override
    protected void applyOppEffects(Pokemon opponent){
        opponent.setMod(Stat.ACCURACY, -1);
    }
}
