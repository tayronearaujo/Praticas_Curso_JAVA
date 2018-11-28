
public abstract class Estado
{
   private Personagem p; 
   private int limiteInferior;
   private int limiteSuperior;
   
   public Estado(Personagem p)
   {
      this.p = p;
      setLimites();
   }
    
   public abstract void setLimites();
    
   public Personagem getPersonagem(){
        return p;
    }
    
   public void setLimiteInferior(int li){
    limiteInferior = li;
    }
   
   public void setLimiteSuperior(int ls){
    limiteSuperior = ls;
    }
   
   public int getLimiteInferior(){
       return this.limiteInferior;
    }
   
   public int getLimiteSuperior(){
       return this.limiteSuperior;
    }
   
   public void sofrerDano(int d)
    {
        p.setLife(p.getLife() - d);
        System.out.println("Personagem sofreu dano! Vida: " + p.getLife());
        this.verificarEstado();
    }
    
   public void ganharVida(int d)
   {
        p.setLife(p.getLife() + d);
        System.out.println("Personagem ganhou vida! Vida: " + p.getLife());
        this.verificarEstado();
   }
    
   protected abstract void verificarEstado();
   
}
