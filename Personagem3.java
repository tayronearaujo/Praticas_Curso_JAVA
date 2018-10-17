
public class Personagem3 extends Personagem
{
    public Personagem3(int x, int y){
      super(x, y);
      setStrategy(new ataqueMédio(), new correrMédio(),new pularMédio());
    
    }
}
