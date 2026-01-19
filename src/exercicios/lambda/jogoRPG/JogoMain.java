package exercicios.lambda.jogoRPG;

public class JogoMain {

    public static void main(String[] args) {

        Personagem bruxo = new Mago("Bruxo", 2345, 5400, 3, 27, 2,3);
        Personagem heman = new Guerreiro("Hemam", 4500, 560, 3, 1,4,false);

        System.out.println(bruxo.getVida());

        heman.atacar(bruxo);

        System.out.println(bruxo.getVida());


        System.out.println(heman.toString());
        System.out.println(bruxo.toString());


    }
}
