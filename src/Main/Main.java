
package Main;

import Observer.Barista;
import Subject.CoffeeCooperative;
import java.util.Scanner; // Importado, pero no usado en este ejemplo

/**
 * Clase Main:
 * 
 * Punto de entrada del programa. Aquí se simula el uso del patrón Observer
 * creando una cooperativa de café (Subject) y varios baristas (Observers).
 * 
 * - Se registran baristas para recibir notificaciones.
 * - Se anuncia un nuevo microlote de café y se notifica a los baristas.
 * - Se elimina un barista de la lista.
 * - Se anuncia otro microlote para demostrar que solo el barista restante
 *   recibe la actualización.
 * 
 * @author Estudiantes
 */
public class Main {

    public static void main(String[] args) {
        // Crear una instancia de la cooperativa de café (Subject)
        CoffeeCooperative coffeeCop = new CoffeeCooperative();

        // Crear dos baristas (Observers) con nombre e ID
        Barista b1 = new Barista("Jose", 12423);
        Barista b2 = new Barista("Andrew", 23532);

        // Registrar ambos baristas en la cooperativa para que reciban notificaciones
        coffeeCop.registerObserver(b1);
        coffeeCop.registerObserver(b2);

        // Publicar un nuevo microlote de café y notificar a todos los baristas registrados
        coffeeCop.setNewMicrolot(
            "Java",
            "medium-high acidity and a prolonged cocoa residual",
            "Colombia",
            3733,
            "JavaCoffeeColombia",
            250
        );
        
        // Eliminar a Andrew de la lista de observadores
        coffeeCop.removeObserver(b2);
        
        // Publicar otro microlote. Solo "Jose" será notificado esta vez
        coffeeCop.setNewMicrolot(
            "Tabi",
            "very intense flavor, sweet at the beginning and bitter at the end",
            "China",
            2354,
            "TabiTabi-Panda-Company",
            500
        );
    }
}
