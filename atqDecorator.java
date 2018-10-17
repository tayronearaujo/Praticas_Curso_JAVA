
public abstract class atqDecorator extends Atacar{
   
    private Atacar ataqueDecorado;
    private int damage;
    private String descricao;
   
   public atqDecorator (Atacar ataqueDecorado){
    this.ataqueDecorado = ataqueDecorado;
    }
    
   public void setDamage(){
        this.damage = damage;
    }
    
   public int getDamage(){
        return ataqueDecorado.getDamage() + this.damage;
    
    }
    
   public String getDescricao() {
        return ataqueDecorado.getDescricao() + ", "+ this.descricao;
   }
   
   public void atacar(Personagem personagem)
    {
        System.out.println(getDescricao() + ": -" + getDamage());
        personagem.damage(getDamage()); 
     }
}
