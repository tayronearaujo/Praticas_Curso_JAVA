
public class futuristaFactory extends abstractFactory
{
    private static futuristaFactory instancia = new futuristaFactory();
    
    private futuristaFactory(){}
    
    public static futuristaFactory getInstancia()
    {
        return instancia;
    }
    
    public Personagem criarHeroi()
    {
        Personagem p = new Robô(0,0);
        return p;
    }  
    
    public Inimigo criarInimigo()
    {
        Inimigo i = new Inimigo(0,0);
        return i;
    }
}

