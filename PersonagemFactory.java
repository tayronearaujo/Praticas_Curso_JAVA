

public abstract class PersonagemFactory
{
   
    public static Personagem createPersonagem(String tipo){
        
        if(tipo.equals("simple"))
            return PersonagemSimpleFactory.createPersonagem();
         else if(tipo.equals("advanced"))
            return AdvancedFactory.criarPersonagem();
            
            else 
                return null;
    
    }
}