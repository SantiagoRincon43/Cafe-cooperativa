
package Subject;

import Observer.Observer;

/**
 * Interfaz Subject:
 * 
 * Forma parte del patrón de diseño Observer. 
 * Define las operaciones que cualquier "Sujeto" debe implementar 
 * para gestionar a sus observadores. Un sujeto mantiene una lista de 
 * observadores y los notifica cuando ocurre un cambio en su estado.
 * 
 * En este caso, el sujeto es la cooperativa de café que informa a los baristas
 * (observadores) cuando hay un nuevo microlote disponible.
 * 
 * @author Estudiantes
 */
public interface Subject {

    /**
     * Registra un nuevo observador para recibir notificaciones.
     * 
     * @param o Observador que se desea añadir a la lista de suscriptores.
     */
    void registerObserver(Observer o);

    /**
     * Elimina un observador de la lista para que deje de recibir notificaciones.
     * 
     * @param o Observador que se desea eliminar de la lista.
     */
    void removeObserver(Observer o);

    /**
     * Notifica a todos los observadores registrados sobre un cambio o evento.
     */
    void notifyObservers();
}
