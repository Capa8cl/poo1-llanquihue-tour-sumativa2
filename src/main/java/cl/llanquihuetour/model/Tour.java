package cl.llanquihuetour.model;


import cl.llanquihuetour.util.TextoVacioException;
import cl.llanquihuetour.util.ValidadorTextos;

/**
 *
 * Representa al Tour de Llanquihue Tour
 */
public class Tour {
    private String nombre;
    private String destino;
    private int precio;
    private Guia guiaAsignado;

    /**
     *
     * Constructor del Tour
     *
     * @param nombre  Nombre del Tour
     * @param destino Destino del Tour
     * @param precio  Precio de Tour
     * @param guiaAsignado Guía asignado al Tour.
     * @throws TextoVacioException Si alguno de los campos de texto obligatorios viene vacío o null.
     */
    public Tour(String nombre, String destino, int precio, Guia guiaAsignado) throws TextoVacioException {
        if (ValidadorTextos.textoVacio(nombre)) {
            throw TextoVacioException.vacio("El nombre del Tour");
        }
        if (ValidadorTextos.textoVacio(destino)) {
            throw TextoVacioException.vacio("El destino del Tour");
        }
        if (guiaAsignado == null) {
            throw new TextoVacioException("El guia asignado no puede estar vacío.");
        }

        this.nombre = nombre;
        this.destino = destino;
        this.precio = precio;
        this.guiaAsignado = guiaAsignado;
    }

    /**
     *
     * Muestra la información del Tour.
     *
     * @return Información del Tour separado por salto de línea.
     */
    public String mostrarTour() {
        return "Nombre Tour: " + nombre + ". Destino: " + destino + ". Precio: $" + precio + ". Guia Asignado: " + guiaAsignado.getNombre() + " " + guiaAsignado.getApellido();
    }

    // Getters y Setters

    /**
     *
     * Obtiene el nombre del Tour.
     *
     * @return Nombre del tour.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * Establece el nombre del Tour.
     *
     * @param nombre Establece el nombre del Tour.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * Obtiene el destino del Tour.
     *
     * @return Destino del Tour.
     */
    public String getDestino() {
        return destino;
    }

    /**
     *
     * Establece el destino del Tour.
     *
     * @param destino Establece el destino del Tour.
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     *
     * Obtiene el precio del Tour.
     *
     * @return Precio del Tour.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     *
     * Establece el precio del Tour.
     *
     * @param precio Establece el precio del Tour.
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return mostrarTour();
    }
}
