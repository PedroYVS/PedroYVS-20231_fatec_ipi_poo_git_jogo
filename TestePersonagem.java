//Cabe as classes manterem a consistência do estado(valores das variáveis de instância) de seus objetos.

public class TestePersonagem {
    public static void main(String[] args) throws Exception{
        //Construindo um objeto abaixo.
        //[Personagem p = new Personagem();]
        //Acima há uma variável de referência, o "p". Ela referencia o objeto construido com "new".
        
        //Java 10+ (inferência de tipo).
        var p = new Personagem(2, 4, 10);
        p.nome = "John";
        while(true){
            p.cacar();
            p.comer();
            p.dormir();
            p.cacar();
            p.cacar();
            p.cacar();
            System.out.println("================================================================");
            Thread.sleep(5000);
        }
    }
}
