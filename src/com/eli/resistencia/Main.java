package com.eli.resistencia;

public class Main {

    public static void main(String[] args) {
        int longitud = 1; // m
        int diametro = 1; // mm
        double resistividadCobre = 1.78e-8;
        double resistividadSilicio = 2300;
        int corriente = 25; //A

        double area = calcularArea(diametro);
        double resistenciaDelCobre = calcularResistencia(resistividadCobre, area, longitud);
        double tensionElectricaEnElCobre = calcularTension(resistenciaDelCobre, corriente);
        imprimirResultados("cobre", resistenciaDelCobre, tensionElectricaEnElCobre);

        double resistenciaDelSilicio = calcularResistencia(resistividadSilicio, area, longitud);
        double tensionElectricaEnElSilicio = calcularTension(resistenciaDelSilicio, corriente);
        imprimirResultados("silicio", resistenciaDelSilicio, tensionElectricaEnElSilicio);
    }

    public static double calcularArea(int diametro) {
        double area = Math.PI * diametro * diametro / 4e6;  // diametro en m= d/1000, por lo tanto area = pi*(d/1000)^2/4 =pi*d^2/40000000
        return area;
    }

    public static double calcularResistencia(double resistividad, double area, double longitud) {
        double resistencia = resistividad * longitud / area;
        return resistencia;
    }

    public static double calcularTension(double resistencia, double corriente) {
        double tension = resistencia * corriente;
        return tension;
    }

    public static void imprimirResultados(String material, double resistenciaDelMaterial, double tensionEnElMaterial) {
        System.out.println("Para el " + material + ": ");
        System.out.println("La resistencia del cable es: " + resistenciaDelMaterial + " ohm");
        System.out.println("La tension electrica del cable es de: " + tensionEnElMaterial + " V");
        System.out.println();
    }

}
