package com.eli.resistencia;

public class Main {

    public static void main(String[] args) {

	// write your code here
        int longitud= 1;
        int diametro= 1;
        double resistividadCobre=1.78e-8;
        double resistividadSilicio=2300;
        System.out.println("resistividadCobre = " + resistividadCobre);

        double area=calcularArea(diametro);
        calcularResistencia(resistividadCobre,area,longitud);
        calcularResistencia(resistividadSilicio,area,longitud);

    }

    public static double calcularArea(int diametro){
        double area=Math.PI*diametro*diametro/4e6;  // diametro en m= d/1000, por lo tanto area = pi*(d/1000)^2/4 =pi*d^2/40000000
        System.out.println("area = " + area);
        return area;

    }

    public static  double calcularResistencia(double resistividad, double area, double longitud){
        double resistencia =resistividad*longitud/area;
        System.out.println("La resistencia del cable es: " + resistencia);
        return resistencia;
    }
}
