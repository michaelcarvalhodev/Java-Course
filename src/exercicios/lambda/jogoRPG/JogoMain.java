package exercicios.lambda.jogoRPG;

public class JogoMain {

    public static void main(String[] args) {

        Personagem bruxo = new Mago("Bruxo", 3345, 600, 3, 27, 2,3);
        Personagem heman = new Guerreiro("Hemam", 4500, 560, 3, 1,4,false);

        Combate combate = new Combate();

        System.out.println(heman.toString());
        System.out.println(bruxo.toString());


        combate.comecarCombate(bruxo,heman);

        Personagem arrow = new Arqueiro ("Arrow", 3100, 530, 30, 10,5);
        System.out.println(arrow.toString());

    }
}
