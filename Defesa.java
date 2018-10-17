
public abstract class Defesa
{
    private Defesa sucessor;
    
    public void setSucessor(Defesa sucessor){
        this.sucessor = sucessor;
    
    }
    
    public Defesa getsucessor(){
        return this.sucessor;
    
    }
    
    public abstract void processaDefesa(Personagem p, Atacar ataque); 
}
