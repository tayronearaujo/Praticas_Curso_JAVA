
public class Fogo extends atqDecorator
{
    public void Atacar(){}
    
    
     public Fogo (Atacar ataqueDecorado) {
        super(ataqueDecorado);
        setDamage(1000);    
        setDescricao(" + ataque de Fogo!");
    }
}
