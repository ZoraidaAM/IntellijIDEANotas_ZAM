package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("La calificación real de " + args[0] + " es " + args[2]);
        System.out.println("Tu calificación esperada era " + args[1]);
        System.out.println(veredicto(args[1],args[2]));
    }

    /**
     * Este método compara dos valores e imprime el resultado
     * @param valor1 calificación deseada en el módulo
     * @param valor2 calificación real del módulo
     * @return mensaje resultado de la comparación de valores
     */
    private static String veredicto(String valor1, String valor2){
        if (valor1.equals(valor2)) {
            return "Perfecto. Has tenido buen criterio.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
            return "Has mejorado, o te ha llegado el éxito inesperado.";
        }
        return "Te has confiado. Falta realismo.";
    }

}

