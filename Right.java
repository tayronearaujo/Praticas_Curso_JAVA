
public class Right implements Command {
  
    private Personagem p;
    
   public Right(Personagem p)
    {
        this.p = p;
    }
    
   public void execute()
    {
        p.setX(p.getX()+1);
        System.out.println("Personagem se moveu para a direita.");
    } 
    
}
