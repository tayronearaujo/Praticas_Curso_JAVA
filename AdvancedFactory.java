
public class AdvancedFactory 
{
    public static Personagem criarPersonagem() 
    {
  PersonagemSimpleFactory fabrica;
  Personagem p = fabri ca.createPersonagem();  
  
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