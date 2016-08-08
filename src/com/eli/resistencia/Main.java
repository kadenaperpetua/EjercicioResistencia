package com.eli.resistencia;

public class Main {

    public static void main(String[] args) {

	// write your code here
        int Longitud= 1;
        int diametro= 1;
        double resistividadCobre=1.78e-8;
        double resistividadSilicio=2300;



    }

    public static double calcularArea(int diametro){
        double pi=3.14;
        double area=pi*(diametro/1000)*(diametro/1000)/4;
        return area;
    }

    public static  double calcularResistencia(double resistividad, double area, double longitud){
        double resistencia =resistividad*longitud/area;
        System.out.println("La resistencia del cable es: " + resistencia);
        return resistencia;
    }
}
