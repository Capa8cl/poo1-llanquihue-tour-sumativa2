package cl.llanquihuetour.model;

import cl.llanquihuetour.util.TextoVacioException;
import cl.llanquihuetour.util.ValidadorTextos;

/**
 *
 * Representa al Proveedor de Llanquihue Tour.
 * Heredada de la clase Persona.
 */
public class Proveedor extends Persona {
    private String idProveedor;

    /**
     *
     * Constructor del Proveedor de Llanquihue Tour.
     *
     * @param empresa     Nombre de la empresa del proveedor.
     * @param rut         RUT de la empresa del proveedor.
     * @param telefono    Teléfono de la empresa del proveedor.
     * @param direccion   Dirección de la empresa del proveedor.
     * @param correo      Correo electrónico de la empresa del proveedor.
     * @param idProveedor Identificador único del proveedor.
     * @throws TextoVacioException Si alguno de los campos de texto obligatorios viene vacío o null.
     */
    public Proveedor(String empresa, Rut rut, String telefono, Direccion direccion, String correo, String idProveedor) throws TextoVacioException {
        super(empresa, "Empresa", rut, telefono, direccion, correo);
        if (ValidadorTextos.textoVacio(idProveedor)) {
            throw TextoVacioException.vacio("El ID del proveedor");
        }

        this.idProveedor = idProveedor;
    }

    /**
     *
     * Muestra la información de la empresa del proveedor.
     *
     * @return Datos de la empresa del proveedor separados por salto de línea.
     */
    public String mostrarProveedor() {
        return mostrarPersona() + "ID del Proveedor: " + idProveedor + "\n";
    }

    // Setters y Getters

    /**
     *
     * Obtiene el identificador único del proveedor.
     *
     * @return Identificador único del proveedor.
     */
    public String getIdProveedor() {
        return idProveedor;
    }

    /**
     *
     * Establece el identificador único del proveedor.
     *
     * @param idProveedor Establece el identificador único del proveedor.
     */
    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Override
    public String toString() {
        return super.toString() + "ID del Proveedor: " + idProveedor + "\n";
    }
}
