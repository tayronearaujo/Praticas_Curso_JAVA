import java.util.ArrayList;
import java.util.Arrays;

public class Joystick
{
    private Command JoystickButton[] = new Command[10];
    private ArrayList<Command> log = new ArrayList<Command>();
    
    public void setCommand(Command c, int n)
    {
        JoystickButton[n] = c;
    }
    
    public void apertaBotao(int n)
    {
        log.add(JoystickButton[n]);
        JoystickButton[n].execute();
    }
    
    public void replay()
    {
        for(Command com : log)
        {
            com.execute();
            System.out.println("");
        }
        
        
    }
    
}