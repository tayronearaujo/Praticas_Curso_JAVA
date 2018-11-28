
public class estadoMorto extends Estado
{
    public void setLimites(){}
    public void verificarEstado(){}
    
    public estadoMorto(Personagem p)
    {
        super(p);
        System.out.println("O personagem está morto!");
    }
}
