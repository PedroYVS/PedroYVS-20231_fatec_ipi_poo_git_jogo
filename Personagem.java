//Em Java chama-se método em vez de função. Métodos possuem tipo de retorno, nome de chamada,...
//... conjunto de parâmetros e corpo.

import static java.lang.Math.min;

public class Personagem{
    //Isso é uma variável de instância.
    String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;

    //Construtor de objeto. (Construtores padrão são aqueles que tem a lista de parâmetros vazia).
    Personagem(int energia, int fome, int sono){
        if(energia >= 0 && energia <= 10)
            this.energia = energia;
        if(fome >= 0 && fome <= 10)
            this.fome = fome;
        if(sono >= 0 && sono <= 10)
            this.sono = sono;
        System.out.println("Objeto sendo construido.");
    }

    //Isso é um método de instância.
    void cacar(){
        if (energia >= 2){
            System.out.println(nome + " cacando");
            energia -= 2;
        }
        else{
            System.out.println(nome + " sem energia para cacar");
        }
        fome = min(fome + 1, 10);
        sono = min(sono + 1, 10);
        System.out.println(obterEstado());
    }

    void comer(){
        if (fome >= 1){
            System.out.println(nome + " comendo");
            energia = min(energia +1, 10);
            fome--;
        }
        else{
            System.out.println(nome + " sem fome");
        }
        System.out.println(obterEstado());
    }

    void dormir(){
        if (sono >= 1){
            //"%n" é o pula linha para qualquer SO que for (Linux, Windows etc.).
            System.out.printf("%s dormindo%n", nome);
            energia = energia + 1 < 10 ? energia + 1 : 10;
            sono--;
        }
        else{
            System.out.println(nome + " sem sono");
        }
        System.out.println(obterEstado());
    }

    String obterEstado(){
        return String.format("e(%d), s(%d), f(%d)", energia, sono, fome);
    }
}