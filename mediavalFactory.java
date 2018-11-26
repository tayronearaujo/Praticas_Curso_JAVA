
public class mediavalFactory extends abstractFactory
{
    private static mediavalFactory instancia = new mediavalFactory();
    
    private mediavalFactory(){}
    
    public static mediavalFactory getInstancia()
    {
        return instancia;
    }
    
    public Personagem criarHeroi()
    {
        Personagem p = new Arqueiro(0,0);
        return p;
    }  
    
    public Inimigo criarInimigo()
    {
        Inimigo i = new Inimigo(0,0);
        return i;
    }
}
