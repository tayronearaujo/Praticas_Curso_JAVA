
public class estadoPerigo extends Estado
{
    public void setLimites()
    {
        this.setLimiteInferior(1);
        this.setLimiteSuperior(30);
    }
    
    public estadoPerigo(Personagem p)
    {
        super(p);
        p.setAtacar(new ataqueFraco());
        p.setCorrer(new correrDevagar());
        p.setPular(new pularBaixo());
    }
    
    public void verificarEstado()
    {
        if(getPersonagem().getLife() < getLimiteInferior())
            getPersonagem().setEstado(new estadoMorto(getPersonagem()));
        
        else if(getPersonagem().getLife() > getLimiteSuperior()){
            getPersonagem().setEstado(new estadoNormal(getPersonagem()));
            getPersonagem().getEstado().verificarEstado();
        }
    }
}
