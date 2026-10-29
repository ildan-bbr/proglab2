import ru.ifmo.se.pokemon.Battle;
public final class Main {
    public static void main(String[] args){
        Battle battle = new Battle();
        Simisage p1 = new Simisage("Симисэйдж", 10);
        Porygon p2 = new Porygon("Поригон",50);
        Dugtrio p3 = new Dugtrio("Дагтрио",100);
        Espeon p4 = new Espeon("Эспеон",10);
        Meowth p5= new Meowth("Мяуз",50);
        Spoink p6 = new Spoink("Споинк",50);
        battle.addFoe(p1);
        battle.addAlly(p2);
        battle.addAlly(p4);
        battle.addFoe(p3);
        battle.addFoe(p5);
        battle.addAlly(p6);
        battle.go();
    }
}