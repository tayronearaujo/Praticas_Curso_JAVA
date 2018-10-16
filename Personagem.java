import java.util.Observable;

public abstract class Personagem extends Observable {

    private Ataque a;
    private Pulo p;
    private Correr c;
    private int x = 0;
    private int y = 0;
    private int life = 0;


    public void setStrategy(Ataque ataque, Pulo pular, Correr correr) {
        this.a = ataque;
        this.p = pular;
        this.c = correr;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getLife() {
        return this.life;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void atacar(){
     a.atacar();
    }
    

    public void pular() {
        p.pular();
    }

    public void correr() {
        c.correr();
    }

    public void show() {
        setChanged();
        notifyObservers();
    }

}
