

public class escudoRaio extends Defesa
{
   public void processaDefesa(Personagem p, Atacar ataque){
        
        	Atacar teste = ataque;
    	if(teste.getDescricao() == ataque.getDescricao()){
        
    		System.out.println(ataque.getDamage() - 100);
		
    	}
        		  	   	
 	else {
    		getsucessor().processaDefesa(p,ataque);
    	}
    
    }
}
