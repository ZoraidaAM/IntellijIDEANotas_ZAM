package com.company;
/**
 * Primer proyecto intellij IDEA Notas_ZAM
 * @author Zoraida Alonso Muñoz
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("La calificación real de " + args[0] + " es " + args[2]);
        System.out.println("Tu calificación esperada era " + args[1]);
        System.out.println(veredicto(args[1],args[2]));
    }

    public static String veredicto(String valor1, String valor2){
        if (valor1.equals(valor2)) {
            return "Perfecto. Has tenido buen criterio.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
            return "Has mejorado, o te ha llegado el éxito inesperado.";
        }
        return "Te has confiado. Falta realismo.";
    }

}

