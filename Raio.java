public class Raio extends atqDecorator
{
 
    public void Atacar(){}
    
    public Raio (Atacar ataqueDecorado) {
        super(ataqueDecorado);
        setDamage(1000);    
        setDescricao(" + ataque de Raio!");
    }
}
