
public class Personagem2 extends Personagem
{
    public Personagem2(int x, int y){
      super(x, y);
      setStrategy(new ataqueForte(), new correrRápido(),new pularBaixo());
    
    }
}
