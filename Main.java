
public class Main
{
   public static void main(String[] args) throws InterruptedException {
        //Personagem1 personagemA = new Personagem1(100, 0, 0);
        //Personagem2 personagem2 = new Personagem2();
        //Personagem3 personagem3 = new Personagem3();
        
        //TESTANDO COM FABRICA SIMPLES
        //Personagem p = PersonagemSimpleFactory.createPersonagem();
         //Personagem fab = PersonagemFactory.createPersonagem("simple");  
        //if(p != null){
            //System.out.println("Foi criado");
            //System.out.println("Tipo :" + p);}
        //else 
           // System.out.println("Erro");
        
        
        abstractFactory criar = futuristaFactory.getInstancia();
              
        if(criar != null){
            System.out.println("Foi criado fututista " + criar);
        }
        
        abstractFactory criar2 = mediavalFactory.getInstancia();
        if(criar2 != null){
            System.out.println("Foi criado medieval" + criar2);
        }
        //Inimigo i1 = new Inimigo(0,0);
        //Inimigo i2 = new Inimigo(0,0);
        
        

        //Inimigo inimigoA = new Inimigo(2, 10);
        //Inimigo inimigoB = new Inimigo(20,20);
        //Inimigo inimigoC = new Inimigo(10,10);

        //personagemA.addObserver(inimigoA);
       //personagemA.addObserver(inimigoB);
        //personagemA.addObserver(inimigoC);

        //while (true) {
        //    personagemA.show();
        //    Thread.sleep(500);
       // }
        
    }
}
