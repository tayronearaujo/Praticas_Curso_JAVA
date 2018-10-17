
public class Gelo extends atqDecorator
{
    public void Atacar(){}
  
    public Gelo (Atacar ataqueDecorado) {
        super(ataqueDecorado);
        setDamage(1000);    
        setDescricao(" + ataque de gelo!");
    }
}

