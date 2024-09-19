public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //En Java el punto no significa separacion de miles, sino de decimales.
        double salarioMinimo = 2.500;
        System.out.println(salarioMinimo);

        //Un tipo de dato primitivo que sea menor si puede ser asignado a un tipo de dato mayor.
        //Pero un tipo de dato mayor no puede ser asignado a un tipo de dato más pequeño.
        //Lo podemos ver en el siguiente ejemplo donde int numeroNormal no cabe en short numeroCurto2.
        //A menos que se castee int numeroNormal a short numeroNormal.
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2);

        //Si se le agrega la palabra "final" ya no se puede modificar la variable VALOR_DE_PI.
        double VALOR_DE_PI = 3.1416;
        VALOR_DE_PI = 17.5512;
        System.out.println(VALOR_DE_PI);
    }
}
