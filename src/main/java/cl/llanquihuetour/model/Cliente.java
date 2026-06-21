package cl.llanquihuetour.model;

import cl.llanquihuetour.util.TextoVacioException;
import cl.llanquihuetour.util.ValidadorTextos;

/**
 *
 * Representa al Cliente de Llanquihue Tour.
 * Heredada de la clase Persona.
 */
public class Cliente extends Persona {
    // Atributo de la clase hija
    private String idCliente;

    /**
     *
     * Constructor del Cliente de Llanquihue Tour.
     *
     * @param nombre    Nombre del cliente.
     * @param apellido  Apellido del cliente.
     * @param rut       RUT del cliente.
     * @param telefono  Teléfono del cliente.
     * @param direccion Dirección del cliente.
     * @param correo    Correo electrónico del cliente.
     * @param idCliente ID único del cliente.
     * @throws TextoVacioException Si alguno de los campos de texto obligatorios viene vacío o null.
     */
    public Cliente(String nombre, String apellido, Rut rut, String telefono, Direccion direccion,
                   String correo, String idCliente) throws TextoVacioException {
        super(nombre, apellido, rut, telefono, direccion, correo);
        if (ValidadorTextos.textoVacio(idCliente)) {
            throw TextoVacioException.vacio("El ID del cliente");
        }

        this.idCliente = idCliente;
    }

    /**
     *
     * Muestra la información del cliente.
     *
     * @return Datos del cliente separados por salto de línea.
     */
    public String mostrarCliente() {
        return mostrarPersona() +
                "ID del Cliente: " + idCliente + "\n";
    }

    // Setters y Getters

    /**
     *
     * Obtiene el ID del cliente.
     *
     * @return ID del cliente.
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     *
     * Establece el identificador único del cliente.
     *
     * @param idCliente Establece el identificador único del cliente.
     */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return super.toString() +
                "ID del Cliente: " + idCliente + "\n";
    }
}
