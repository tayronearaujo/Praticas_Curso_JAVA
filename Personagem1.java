public class Personagem1 extends Personagem {

    public Personagem1(int life, int x, int y) {
        setStrategy(new ataqueForte(), new puloMedio(), new correrMedio());
        setPosition(x, y);
        setLife(life);
    }
}



