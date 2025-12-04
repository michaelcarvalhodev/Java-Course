package exercicios.oo.classes;

public class ContadorTeste {

    public static void main(String[] args) {

        System.out.println(Contador.totalObjetos);
        Contador c1 = new Contador();

        System.out.println(Contador.totalObjetos);
        Contador c2 = new Contador();

        System.out.println(Contador.totalObjetos);
        Contador c3 = new Contador();

        System.out.println(Contador.totalObjetos);
        Contador c4 = new Contador();

        System.out.println(Contador.totalObjetos);
        Contador c5 = new Contador();

        System.out.println(Contador.totalObjetos);
    }
}
