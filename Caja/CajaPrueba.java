package Caja;

public class CajaPrueba {
    /**
     * En esta clase se encuentra el método main
     */
    public static void main(String[] args) {
        /**
         * Dentro de esta clase defino los valores de las variables de Caja.
         */
        var ancho = 3;
        var alto = 2;
        var profundo = 6;

        /**
         * Además se creará el objeto de la clase Caja con los argumentos definidos
         * previamente.
         */
        Caja caja1 = new Caja(ancho, alto, profundo);
        int Resultado = caja1.calcularVolumen();
        System.out.println("Ancho = " + caja1.ancho);
        System.out.println("Alto = " + caja1.alto);
        System.out.println("Profundo = " + caja1.profundo);
        System.out.println("Volumen = " + Resultado);
    }
}
