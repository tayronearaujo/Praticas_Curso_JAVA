
public class estadoNormal extends Estado
{
    public void setLimites()
    {
        this.setLimiteInferior(30);
        this.setLimiteSuperior(70);
    }
    
    public estadoNormal(Personagem p)
    {
        super(p);
        p.setAtacar(new ataqueMédio());
        p.setCorrer(new correrMédio());
        p.setPular(new pularMédio());
    }
    
    public void verificarEstado()
    {
        if(getPersonagem().getLife() > getLimiteSuperior())
            getPersonagem().setEstado(new estadoForte(getPersonagem()));
        
        else if(getPersonagem().getLife() < getLimiteInferior()){
            getPersonagem().setEstado(new estadoPerigo(getPersonagem()));
            getPersonagem().getEstado().verificarEstado();
        }
    }
}
