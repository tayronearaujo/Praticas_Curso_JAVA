
public class Down implements Command
{
    private Personagem p;
    
    public Down(Personagem p)
    {
        this.p = p;
    }
    
    public void execute()
    {
        p.setY(p.getY()-1);
        System.out.println("Personagem se moveu para baixo.");
    } 
}
