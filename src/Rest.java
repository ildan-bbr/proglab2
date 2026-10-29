import ru.ifmo.se.pokemon.*;
public final class Rest extends StatusMove{
    public Rest(){
        super(Type.PSYCHIC,0,1.0);
    }
    @Override
    protected String describe() {
        return "Применяет Rest";
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setCondition(new Effect().condition(Status.SLEEP).attack(0.0).turns(2));
        p.setMod(Stat.HP, -(int) (p.getStat(Stat.HP)-p.getHP()));
    }
    @Override
    protected boolean checkAccuracy(Pokemon attacker, Pokemon defender) {
        return true;
    }
}
