
public class Robô extends Personagem
{
    public Robô(int x, int y){
      super(x, y);
      setAtacar (new raioParalizante());
      setCorrer(new correrRápido());
      setPular(new pularMédio());
      
      setDefesa(new campoMagnetico());
    
    }
}
