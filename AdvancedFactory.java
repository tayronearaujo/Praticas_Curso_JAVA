
public class AdvancedFactory extends PersonagemFactory
{
    private static AdvancedFactory instancia = new AdvancedFactory();
    
    private AdvancedFactory() {}
    
    public static AdvancedFactory getInstancia()
    {
        return instancia;
    }
    
    public static Personagem criarPersonagem() 
        {
      PersonagemSimpleFactory fabrica = PersonagemSimpleFactory.getInstancia();
        Personagem p = fabrica.createPersonagem();  
      
      double tipo = Math.random();
      
      if(tipo < 0.2)
            {
                p.setAtacar(new Gelo(p.getAtaque()));
            }
            
            else if(tipo < 0.4)
            {
                p.setAtacar(new Fogo (p.getAtaque()));
            }
            
            else if(tipo < 0.6)
            {
                p.setAtacar(new Raio(p.getAtaque()));
            }
                    
            else if(tipo < 0.8)
            {
                p.setAtacar(new ataquex2(p.getAtaque()));
            }
                    
            else
            {
                p.setAtacar(new ataquex3(p.getAtaque()));  
            }       
            return p;
        
    }
}