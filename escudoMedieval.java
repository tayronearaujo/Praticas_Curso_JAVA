
public class escudoMedieval extends Defesa
{
    public void processaDefesa(Personagem p, Atacar ataque){
         Atacar a = ataque;
    	if(a.getDescricao() == a.getDescricao()){
        
    		System.out.println(a.getDamage() - 40);
		
    	}
        		  	   	
 	else {
    		getsucessor().processaDefesa(p,ataque);
    	}
    
    }
}
