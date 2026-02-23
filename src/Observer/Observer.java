
package Observer; // Indica que esta interfaz pertenece al paquete Observer

/**
 * Interfaz Observer: 
 * Forma parte del patrón de diseño Observer. 
 * Las clases que implementen esta interfaz se "suscriben" a un sujeto (Subject)
 * para recibir notificaciones cuando haya cambios en los datos relacionados
 * con el café (tipo, notas de cata, origen, etc.).
 *
 * @author Estudiantes
 */
public interface Observer {

    /**
     * Método llamado por el Subject para notificar a los observadores cuando 
     * hay una actualización de datos.
     *
     * @param coffeeType Tipo de café (ejemplo: Arábica, Robusta).
     * @param tastingNotes Notas de cata (ejemplo: "Chocolate y frutos rojos").
     * @param originPlace Lugar de origen del café (ejemplo: "Colombia").
     * @param cropHeight Altura de cultivo en metros o pies.
     * @param producerName Nombre del productor o finca.
     * @param quantityAvailable Cantidad disponible del café (en kg, libras, etc.).
     */
    void update(String coffeeType, String tastingNotes, String originPlace,
                float cropHeight, String producerName, float quantityAvailable);

    /**
     * Devuelve el nombre del observador.
     * Útil para identificar qué observador está recibiendo las actualizaciones.
     *
     * @return Nombre del observador.
     */
    String returnName();
}

