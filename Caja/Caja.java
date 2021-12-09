package Caja;

public class Caja {
    /**
     * Creo la clase Caja y declaro sus variables o atributos.
     * Esta clase sirve de plantilla.
     * Esta clase NO contiene el método main.
     */
    int ancho;
    int alto;
    int profundo;

    /**
     * Dentro del cuerpo de la clase se define el constructor. Es un método que no
     * devuelve nada y se llama siempre igual que la clase.
     * NO ES NECESARIO ESCRIBIRLO EN EL CODIGO, pero se escribe para hacer notar su
     * existencia.
     * Cada vez que se llama a este constructor desde otra clase, se está creando un
     * objeto de dicha clase.
     * El constructor no devuelve nada, pero para saber que se ejecuta mando
     * imprimir en consola un mensaje.
     */

    /**
     * Creo un método que puede recibir los parámetros.
     * Esos parámetros serán asignados a las variables declaradas de esta clase.
     */
    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        /**
         * Además, este método, tras asignarse los argumentos tiene que devolver el dato
         * del volumen.
         * El volumen se calcula en otro método.
         */
        return;
    }

    /**
     * Este método hace el cálculo del volumen y lo devuelve al método que lo ha
     * llamado.
     */
    public int calcularVolumen() {
        return ancho * alto * profundo;
    }
}