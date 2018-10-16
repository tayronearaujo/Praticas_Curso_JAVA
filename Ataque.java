

public abstract class Ataque
{
    private int damage;
    private String descricao;
    
    public abstract void atacar();
    
    public void setDamage(int damage){
        this.damage = damage;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao; 
    
    }
    
    public int getDamage(){
        return this.damage;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
}