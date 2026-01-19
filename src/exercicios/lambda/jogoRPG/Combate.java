package exercicios.lambda.jogoRPG;

public class Combate {

    public void comecarCombate(Personagem j1, Personagem j2) {
        System.out.println(" INÍCIO DO COMBATE ");
        System.out.println(j1.getNome() + " VS " + j2.getNome());





        while (j1.getVida() > 0 && j2.getVida() > 0) {

            int danoJ1 = j1.atacar(j2);
            System.out.println(j1.getNome() + " atacou e causou " + danoJ1 + " de dano!");
            System.out.println("Vida de " + j2.getNome() + ": " + j2.getVida());


            if (j2.getVida() <= 0) {
                System.out.println(j2.getNome() + " foi derrotado!");
                break;
            }

            System.out.println("---");


            int danoJ2 = j2.atacar(j1);
            System.out.println(j2.getNome() + " atacou e causou " + danoJ2 + " de dano!");
            System.out.println("Vida de " + j1.getNome() + ": " + j1.getVida());

            System.out.println("--------------------------------");
        }


        if (j1.getVida() > 0) {
            System.out.println("Vencedor: " + j1.getNome());

        } else {
            System.out.println("Vencedor: " + j2.getNome());
        }
    }


}
