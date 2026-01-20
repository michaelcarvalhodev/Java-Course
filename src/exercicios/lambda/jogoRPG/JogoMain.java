package exercicios.lambda.jogoRPG;

public class JogoMain {

    public static void main(String[] args) {

        Personagem bruxo = new Mago("Bruxo", 3345, 600, 3, 27, 2,3);
        Personagem heman = new Guerreiro("Hemam", 4500, 560, 3, 1,4,false);

        Combate combate = new Combate();

//        System.out.println(heman.toString());
//        System.out.println(bruxo.toString());


        Arma espadaDoPoder = new Arma("Espada do Poder", "Espada", 1500, 250);
        heman.equiparItem(espadaDoPoder);

        combate.comecarCombate(bruxo,heman);


    }
}
