
public abstract class ataqueDecorator
{
    private Ataque ataqueDecorado;
    
    public ataqueDecorator (Ataque ataqueDecorado){
        this.ataqueDecorado = ataqueDecorado;
      
    }
 
    public int getDamage (){
        return ataqueDecorado.getDamage()+this.damage;     
    }
    
    
    public String getDescricao() {
        return ataqueDecorado.getDescricao() + ","+ this.descricao;
    }

    
}
