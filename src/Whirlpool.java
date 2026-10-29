import ru.ifmo.se.pokemon.*;
public final class Whirlpool extends SpecialMove {
    public Whirlpool(){
        super(Type.WATER,35,0.85);
    }
    @Override
    protected String describe() {
        return "Применяет Whirlpool";
    }
    @Override
    protected void applyOppEffects(Pokemon opponent){
        opponent.addEffect(new Effect().turns((int)(Math.random()*2)+4).stat(Stat.HP,(int) opponent.getStat(Stat.HP)/8));
    }
}
