
package Observer;

/**
 * Clase Barista:
 * Implementa la interfaz Observer y representa a un barista que recibe 
 * notificaciones sobre la disponibilidad de microlotes de café especial.
 * 
 * Forma parte del patrón de diseño Observer: cuando el Subject (por ejemplo, 
 * una cooperativa de café) actualiza la información, el barista es notificado 
 * mediante el método update().
 * 
 * @author Estudiantes
 */
public class Barista implements Observer {
    
    // ============================
    // Atributos
    // ============================
    private String name; // Nombre del barista
    private int id;      // Identificador único del barista

    /**
     * Constructor de Barista.
     * 
     * @param name Nombre del barista.
     * @param id Identificador único.
     */
    public Barista(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // ============================
    // Métodos getters y setters
    // ============================

    /** @return El nombre del barista. */
    public String getName() {
        return name;
    }

    /** @param name Nuevo nombre para el barista. */
    public void setName(String name) {
        this.name = name;
    }

    /** @return El identificador del barista. */
    public int getId() {
        return id;
    }

    /** @param id Nuevo identificador para el barista. */
    public void setId(int id) {
        this.id = id;
    }
    
    // ============================
    // Métodos de la interfaz Observer
    // ============================

    /**
     * Devuelve el nombre del barista.
     * Implementación de returnName() de la interfaz Observer.
     * 
     * @return Nombre del barista.
     */
    @Override
    public String returnName() {
        return name;
    }
    
    /**
     * Método que se ejecuta cuando el Subject notifica cambios.
     * Muestra en consola la información del microlote de café disponible.
     * 
     * @param coffeeType Tipo de café (por ejemplo, Arábica).
     * @param tastingNotes Notas de cata (por ejemplo, "Chocolate y frutos rojos").
     * @param originPlace Lugar de origen del café.
     * @param cropHeight Altura de cultivo (en metros sobre el nivel del mar).
     * @param producerName Nombre del productor o finca.
     * @param quantityAvailable Cantidad disponible (en libras).
     */
    @Override
    public void update(String coffeeType, String tastingNotes, String originPlace,
                       float cropHeight, String producerName, float quantityAvailable) {
        System.out.println("_____________________________________________");
        System.out.println("MICROLOT OF SPECIALTY COFFEE AVAILABLE");
        System.out.println("Coffee Type: " + coffeeType);
        System.out.println("Tasting Notes: " + tastingNotes);
        System.out.println("Origin Place: " + originPlace);
        System.out.println("Crop Height: " + cropHeight + " masl");
        System.out.println("Producer Name: " + producerName);
        System.out.println("Quantity Avaliable: " + quantityAvailable + " lbs");
        System.out.println("_____________________________________________");
    }
}
