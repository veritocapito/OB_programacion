public class Main {
    public static void main(String[] args) {
        Integer numeroif = -20;

        if (numeroif > 0) {
            System.out.println("El numero es positivo");
        }  else if (numeroif < 0) {
            System.out.println("El numero es negativo");
        }   else {
            System.out.println("El numero es " + numeroif);
        }

        System.out.println("--------------");

        Integer numeroWhile = 0;
        while ( numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;

        }
        System.out.println("--------------");
        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
        while (numeroWhile < 0);

        System.out.println("--------------");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("--------------");

        String estacion = "carnaval";

        switch (estacion) {
            case "verano":
            case "invierno":
            case "otoño":
            case "primavera":
                System.out.println("Es " + estacion);
                break;
            default:
                System.out.println("No es una estacion");

        }
        System.out.println("--------------");
    }
}
