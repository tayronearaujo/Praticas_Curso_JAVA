
public abstract class Atacar
{
  private int damage = 0;
  private String descricao;
  public abstract void Atacar();

  public void setDamage(int damage){
        this.damage = damage;
   }
    
  public int getDamage(){
        return this.damage;   
   }
    
  public void setDescricao(String descricao){
        this.descricao = descricao;
   }
    
  public String getDescricao() {
        return this.descricao;
 }
}
