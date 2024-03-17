package mates;

import java.util.Random;
import java.util.function.Supplier;

public class Aproximacion {

    public static double generarNumeroPiLambda(long pasos) {
        Random random = new Random();
        long puntosEnCirculo = generarPuntos(pasos, () -> {
            double x = random.nextDouble();
            double y = random.nextDouble();
            return (x * x + y * y) <= 1;
        });
        return 4.0 * puntosEnCirculo / pasos;
    }

    private static long generarPuntos(long pasos, Supplier<Boolean> dentroCirculo) {
        return java.util.stream.LongStream.range(0, pasos)
                .filter(i -> dentroCirculo.get())
                .count();
    }
}

