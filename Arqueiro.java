
public class Arqueiro extends Personagem
{
    public Arqueiro(int x, int y){
      super(x, y);
      setAtacar(new arcoEflecha());
      setCorrer(new correrMédio());
      setPular (new pularAlto());
      
      setDefesa(new escudoMedieval());
    
    }
}
