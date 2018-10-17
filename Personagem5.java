

public class Personagem5 extends Personagem
{
    public Personagem5(int x, int y){
      super(x, y);
      setStrategy(new ataqueForte(), new correrDevagar(),new pularMédio());
    
    }
}
