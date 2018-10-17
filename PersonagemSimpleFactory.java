
public class PersonagemSimpleFactory
{
    private PersonagemSimpleFactory() {}
    
    public static Personagem createPersonagem(){
        double tipo = Math.random();
        Personagem p = null;
      
     if(tipo < 0.2)
            p = new Personagem1(0,0);
        
        else if(tipo < 0.4)
            p = new Personagem2(0,0);
        
        else if(tipo < 0.6)
            p = new Personagem3(0,0);
                
        else if(tipo < 0.8)
            p = new Personagem4(0,0);
                
        else
            p = new Personagem5(0,0);
            
        
        return p;
     
     
         
    }
}
