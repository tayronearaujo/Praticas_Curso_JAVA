
public class JoystickSimples
{
   private Joystick invoker;
    
    public JoystickSimples(Personagem p)
    {
        this.invoker = new Joystick();
        configurarJoystick(p);
    }
    
    private void configurarJoystick(Personagem p)
    {
        invoker.setCommand(new atacarCommand(p), 3);
        invoker.setCommand(new correrCommand(p), 0);
        invoker.setCommand(new magiaCommand(p), 2);
        invoker.setCommand(new pularCommand(p), 1);
        invoker.setCommand(new Left(p), 3);
        invoker.setCommand(new Right(p), 4);
        invoker.setCommand(new Down(p), 5);
        invoker.setCommand(new Up(p), 6);
        invoker.setCommand(new MacroL(p), 7);
        invoker.setCommand(new MacroR(p), 8);
    }
    
    public Joystick getInvoker()
    {
        return invoker;
    }
}
