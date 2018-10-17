
public class ataquex3 extends atqDecorator
{
    public void Atacar(){}
    
    public ataquex3 (Atacar ataqueDecorado) {
        super(ataqueDecorado);
        setDamage(ataqueDecorado.getDamage()*3);  
        setDescricao(" + ataque x 3!");
    }
}
