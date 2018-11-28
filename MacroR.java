import java.util.ArrayList;

public class MacroR implements Command
{ 
   private Personagem p;
    private ArrayList<Command> macro = new ArrayList<>();
    
    public MacroR(Personagem p)
    {
        this.p = p;
        addCommand(new atacarCommand(p));
        addCommand(new atacarCommand(p));
        addCommand(new magiaCommand(p));
    }
    
    public void addCommand(Command c)
    {
        macro.add(c);
    }
    
    public void execute()
    {
        System.out.println("Combo R!");
        for(Command com : macro)
        {
            System.out.print("\t");
            com.execute();
        }
    }
   
}
