import java.util.Observable;
import java.util.Observer;

public class Inimigo implements Observer {

    private int x = 0;
    private int y = 0;

    public Inimigo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void update(Observable subject, Object args) {
        Personagem personagem = (Personagem)subject;

        if (personagem.getLife() > 0) {
            if (((this.x - personagem.getX()) == 0) & ((this.y - personagem.getY()) == 0)) {
                System.out.println("Inimigo: " + this + "bate no personagem");
                personagem.setLife(personagem.getLife() - 5);
                System.out.println("Personagem: " + personagem + " tem " + personagem.getLife() + " de vida");
            } else {
                if (personagem.getX() > this.x) this.x = this.x + 1;
                else this.x = this.x - 1;

                if (personagem.getY() > this.y) this.y = this.y + 1;
                else this.y = this.y - 1;
            }
        } else {
            System.out.println("Personagem " + personagem + " esta morto");
        }

    }
}
