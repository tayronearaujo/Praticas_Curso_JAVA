
public class ataquex2 extends atqDecorator
{
    public void Atacar(){}
    
    public ataquex2 (Atacar ataqueDecorado) {
        super(ataqueDecorado);
        setDamage(ataqueDecorado.getDamage()*2);   
        setDescricao(" + Dano x2");
    }
}
