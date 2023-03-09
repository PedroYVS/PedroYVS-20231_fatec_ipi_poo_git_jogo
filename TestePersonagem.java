public class TestePersonagem {
    public static void main(String[] args){
        //Construindo um objeto abaixo.
        //[Personagem p = new Personagem();]
        //Acima há uma variável de referência, o "p". Ela referencia o objeto construido com "new".
        
        //Java 10+ (inferência de tipo).
        var p = new Personagem();
        p.nome = "John";
        p.cacar();
        p.comer();
        p.dormir();

    }
}
