package cl.llanquihuetour.util;

/**
 *
 * Clase auxiliar que contiene métodos de validación para Llanquihue Tour.
 */
public class ValidadorTextos {

    /**
     *
     * Valida que el texto no esté vacío.
     *
     * @param texto Texto a validar.
     * @return Devuelve true si el texto está vacío o es null, devuelve false si tiene contenido.
     */
    public static boolean textoVacio(String texto) {
        return texto == null || texto.trim().isEmpty();
    }

}