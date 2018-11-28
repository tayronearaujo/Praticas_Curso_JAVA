
public class estadoForte extends Estado
{
     public void setLimites()
    {
        this.setLimiteInferior(70);
    }
    
    public estadoForte(Personagem p)
    {
        super(p);
        p.setAtacar(new ataqueForte());
        p.setCorrer(new correrRápido());
        p.setPular(new pularAlto());
    }
    
    public void verificarEstado()
    {
        if(getPersonagem().getLife() < getLimiteInferior()){
            getPersonagem().setEstado(new estadoNormal(getPersonagem()));
            getPersonagem().getEstado().verificarEstado();
        }
    }
}
