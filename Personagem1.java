
public class Personagem1 extends Personagem{
   
    public Personagem1(int x, int y){
      super(x, y);
      setStrategy(new ataqueForte(), new correrMédio(),new pularMédio());
    
    }
}
