
public class Personagem4 extends Personagem
{
    public Personagem4(int x, int y){
      super(x, y);
      setStrategy(new ataqueFraco(), new correrMédio(),new pularAlto());
    
    }
}
