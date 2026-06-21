package cl.llanquihuetour.model;

import cl.llanquihuetour.util.TextoVacioException;

/**
 *
 * Representa al Guía de Llanquihue Tour.
 * Heredada de la clase Persona.
 */
public class Guia extends Empleado {
    private boolean certificado;

    /**
     *
     * Constructor del Guía de Llanquihue Tour.
     *
     * @param nombre      Nombre del guía.
     * @param apellido    Apellido del guía.
     * @param rut         RUT del guía.
     * @param telefono    Teléfono del guía.
     * @param direccion   Dirección del guía.
     * @param correo      Correo electrónico del guía.
     * @param idEmpleado  Identificador único del guía.
     * @param cargo       Cargo del guía.
     * @param certificado Información de la certificación del guía (boolean true / false).
     * @throws TextoVacioException Si alguno de los campos de texto obligatorios viene vacío o null.
     */
    public Guia(String nombre, String apellido, Rut rut, String telefono, Direccion direccion,
                String correo, String idEmpleado, String cargo, boolean certificado) throws TextoVacioException {
        super(nombre, apellido, rut, telefono, direccion, correo, idEmpleado, cargo);

        this.certificado = certificado;
    }

    /**
     *
     * Muestra la información del guía.
     *
     * @return Datos del guía separados por salto de línea.
     */
    public String mostrarGuia() {
        String textoCertificado = "";
        if (certificado) {
            textoCertificado = "Está certificado";
        } else {
            textoCertificado = "No está certificado";
        }

        return mostrarEmpleado() +
                "\nCertificado: " + textoCertificado + "\n";
    }

    // Getters y Setters

    /**
     *
     * Muestra el estado de la certificación del guía.
     *
     * @return Estado de la certificación del guía.
     */
    public boolean isCertificado() {
        return certificado;
    }

    /**
     *
     * Establece el estado de la certificación del guía.
     *
     * @param certificado Establece el estado de la certificación del guía.
     */
    public void setCertificado(boolean certificado) {
        this.certificado = certificado;
    }


    @Override
    public String toString() {
        String textoCertificado = "";
        if (certificado) {
            textoCertificado = "Está certificado";
        } else {
            textoCertificado = "No está certificado";
        }

        return super.toString() + "\n" +
                "Certificado: " + textoCertificado;
    }
}
