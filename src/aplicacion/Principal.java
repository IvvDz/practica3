package aplicacion;

import mates.Aproximacion;

public class Principal {
    public static void main(String[] args) {
        System.out.println("El número PI es " + Aproximacion.generarNumeroPiLambda(Integer.parseInt(args[0])));
    }
}

