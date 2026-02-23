
package Subject;

import Observer.Observer;
import java.util.ArrayList;

/**
 * Clase CoffeeCooperative:
 * 
 * Representa al "Subject" (sujeto) en el patrón de diseño Observer. 
 * Esta clase mantiene una lista de observadores (baristas) que son 
 * notificados cada vez que hay un nuevo microlote de café disponible.
 * 
 * Gestiona el registro, la eliminación y la notificación de los observadores.
 * También almacena los datos del microlote actual (tipo, notas de cata, 
 * origen, altura de cultivo, productor y cantidad disponible).
 * 
 * @author Estudiantes
 */
public class CoffeeCooperative implements Subject {

    // ============================
    // Atributos
    // ============================
    private ArrayList<Observer> observers; // Lista de baristas suscritos
    private String coffeeType;             // Tipo de café
    private String tastingNotes;           // Notas de cata
    private String originPlace;            // Lugar de origen
    private float cropHeight;              // Altura de cultivo (masl)
    private String producerName;           // Nombre del productor
    private float quantityAvailable;       // Cantidad disponible (lbs)

    /**
     * Constructor: Inicializa la lista de observadores vacía.
     */
    public CoffeeCooperative() {
        this.observers = new ArrayList<>();
    }

    // ============================
    // Métodos del Subject
    // ============================

    /**
     * Registra un nuevo observador (barista) en la lista.
     * 
     * @param o Observador a registrar.
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        System.out.println("---------------------------");
        System.out.println("New Barista added: " + o.returnName());
        System.out.println("---------------------------");
    }

    /**
     * Elimina un observador (barista) de la lista.
     * 
     * @param o Observador a eliminar.
     */
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
        System.out.println("---------------------------");
        System.out.println("Barista " + o.returnName() + " has been removed.");
        System.out.println("---------------------------");
    }

    /**
     * Notifica a todos los observadores registrados, enviando los datos del microlote.
     */
    @Override
    public void notifyObservers() {
        int i = 1;
        for (Observer o : observers) {
            o.update(coffeeType, tastingNotes, originPlace, cropHeight, producerName, quantityAvailable);
            System.out.println("Barista " + o.returnName() + " notified");
            i++;
        }
    }

    // ============================
    // Lógica específica de CoffeeCooperative
    // ============================

    /**
     * Anuncia que un microlote especial está disponible y notifica a todos los observadores.
     */
    public void newSpecialMicrolotAvailable() {
        System.out.println("Special Microlot Available");
        notifyObservers();
    }

    /**
     * Establece los datos de un nuevo microlote de café y notifica a los observadores.
     * 
     * @param coffeeType Tipo de café.
     * @param tastingNotes Notas de cata.
     * @param originPlace Lugar de origen.
     * @param cropHeight Altura de cultivo.
     * @param producerName Nombre del productor.
     * @param quantityAvailable Cantidad disponible.
     */
    public void setNewMicrolot(String coffeeType, String tastingNotes, String originPlace,
                               float cropHeight, String producerName, float quantityAvailable) {
        this.coffeeType = coffeeType;
        this.tastingNotes = tastingNotes;
        this.originPlace = originPlace;
        this.cropHeight = cropHeight;
        this.producerName = producerName;
        this.quantityAvailable = quantityAvailable;

        newSpecialMicrolotAvailable(); // Notifica a los baristas
    }
}
