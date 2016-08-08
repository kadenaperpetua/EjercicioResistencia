package com.eli.resistencia;

public class Main {

    public static void main(String[] args) {

	// write your code here
        int longitud= 1;
        int diametro= 1;
        double resistividadCobre=1.78e-8;
        double resistividadSilicio=2300;
        int corriente =25;


        double area=calcularArea(diametro);
        System.out.println("Para el cobre:");
        calcularTension(calcularResistencia(resistividadCobre,area,longitud),corriente);
        System.out.println();
        System.out.println("Para el silicio:");
        calcularTension(calcularResistencia(resistividadSilicio,area,longitud),corriente);

    }

    public static double calcularArea(int diametro){
        double area=Math.PI*diametro*diametro/4e6;  // diametro en m= d/1000, por lo tanto area = pi*(d/1000)^2/4 =pi*d^2/40000000
        //System.out.println("area = " + area);
        return area;

    }

    public static  double calcularResistencia(double resistividad, double area, double longitud){
        double resistencia =resistividad*longitud/area;
        System.out.println("La resistencia del cable es: " + resistencia + " ohm");
        return resistencia;
    }

    public static double calcularTension(double resistencia, double corriente){
        double tension = resistencia * corriente;
        System.out.println("La tension electrica del cable es de: " + tension + " V");
        return tension;
    }
}
