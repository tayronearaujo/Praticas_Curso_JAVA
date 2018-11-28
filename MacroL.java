import java.util.ArrayList;

public class MacroL implements Command
{
    
  
    private Personagem p;
    private ArrayList<Command> macro = new ArrayList<Command>();
    
    public MacroL(Personagem p)
    {
        this.p = p;
        addCommand(new atacarCommand(p));
        addCommand(new atacarCommand(p));
        addCommand(new atacarCommand(p));
    }
    
    public void addCommand(Command c)
    {
        macro.add(c);
    }
    
    public void execute()
    {
        System.out.println("Combo L!");
        for(Command com : macro)
        {
            System.out.print("\t");
            com.execute();
        }
    }  
}
