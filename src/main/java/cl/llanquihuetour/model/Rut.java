package cl.llanquihuetour.model;

import cl.llanquihuetour.util.RutInvalidoException;
import cl.llanquihuetour.util.TextoVacioException;
import cl.llanquihuetour.util.ValidadorRut;
import cl.llanquihuetour.util.ValidadorTextos;

/**
 *
 * Representa el RUT de la persona de Llanquihue Tour.
 */
public class Rut {
    private String rutCompleto;

    /**
     *
     * Crea y valida instancia de RUT.
     *
     * @param rutCompleto RUT ingresado por el usuario.
     * @throws RutInvalidoException si el RUT no es válido (formato o dígito verificador).
     * @throws TextoVacioException  Si alguno de los campos de texto obligatorios viene vacío o null.
     */
    public Rut(String rutCompleto) throws RutInvalidoException, TextoVacioException {
        if (ValidadorTextos.textoVacio(rutCompleto)) {
            throw TextoVacioException.vacio("El RUT");
        }
        if (!ValidadorRut.validar(rutCompleto)) {
            throw RutInvalidoException.invalido();
        }
        this.rutCompleto = rutCompleto;
    }

    // Getter y Setters
    // No se establece Setter por seguridad.

    /**
     *
     * Obtiene el RUT de la persona.
     *
     * @return RUT completo y validado.
     */
    public String getRut() {
        return rutCompleto;
    }


    @Override
    public String toString() {
        return rutCompleto;
    }

}
