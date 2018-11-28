
public class Up implements Command
{
    private Personagem p;
    
    public Up(Personagem p)
    {
        this.p = p;
    } 
    
    public void execute()
    {
        p.setY(p.getY()+1);
        System.out.println("Personagem se moveu para cima.");
    } 
}
