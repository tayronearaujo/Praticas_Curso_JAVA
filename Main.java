import javax.swing.*;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        Personagem1 personagemA = new Personagem1(100, 0, 0);
       



        Inimigo inimigoA = new Inimigo(2, 10);
        Inimigo inimigoB = new Inimigo(20,20);
        Inimigo inimigoC = new Inimigo(10,10);

        personagemA.addObserver(inimigoA);
        personagemA.addObserver(inimigoB);
        personagemA.addObserver(inimigoC);

        while (true) {
            personagemA.show();
            Thread.sleep(500);
        }
        
    }
}