import java.util.Observable;

public abstract class Personagem extends Observable
{
   private Atacar a;
   private Correr c;
   private Pular p;
   
   private int x;
   private int y;
   private int life;
 
   private Defesa d;
   
   private Estado estado;
   
   public void setStrategy(Atacar a, Correr c, Pular p){
       this.a = a;
       this.c = c;
       this.p = p;
    }
    
   public Personagem(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.life = 100;
    }
    
   public void setDefesa(Defesa d){
            this.d = d;
   }
    
   public Defesa getDefesa(){
            return d;
   }
    
   public void Atacar(){
    a.Atacar();
    }
   
   public void setAtacar(Atacar a)
   {
        this.a = a;
   }
    
   public Atacar getAtaque()
   {
        return this.a;
   }
    
   public void setPular(Pular p)
   {
        this.p = p;
   }
    
   public void setCorrer(Correr c)
   {
        this.c = c;
   }
  
   public void Correr(){
     c.Correr();    
   }
   
   public void Pular(){
     p.Pular();
    }
    
   public int getX() {
        return this.x;
   }

   public int getY() {
        return this.y;
   }    
    
   public void setX(int x)
   {
        this.x = x;
   }
    
   public void setY(int y)
   {
        this.y = y;
   }
    
   public int getLife(){
        return this.life;
   }
    
   public void setLife(int life){
        this.life = life;
   }
    
   public void setPos(int x, int y) {
        this.x = x;
        this.y = y;        
   }
   
   public Estado getEstado(){
        return this.estado;
   }
   
   public void setEstado(Estado estado){
        this.estado = estado;
   }

   public void damage(int d)
   {
        this.life = this.life - d;
        System.out.println("Personagem sofreu dano! Vida: " + this.life);
        
        if(this.life <= 0)
            System.out.println("Personagem morreu!\n");
   }
    
   public void show(){
        setChanged();
        notifyObservers();
   }
}
