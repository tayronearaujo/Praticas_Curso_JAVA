
public class correrCommand implements Command
{
    private Personagem p;
    
    public correrCommand(Personagem p)
    {
        this.p = p;
    }
    
    public void execute()
    {
        p.setX(p.getX() + p.Correr());
        System.out.println("Personagem correndo!");
    }  
    
    
    
}
