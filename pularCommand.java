class pularCommand implements Command
{
    private Personagem p;
    
    public pularCommand(Personagem p)
    {
        this.p = p;
    }

    @Override
    public void execute()
    {
        p.setY(p.getY() + p.Pular());
        System.out.println("Personagem pulando!");
    }  
}