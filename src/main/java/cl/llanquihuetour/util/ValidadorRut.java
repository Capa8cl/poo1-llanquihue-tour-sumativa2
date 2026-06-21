package cl.llanquihuetour.util;

/**
 *
 * Valida que el RUT no esté vacío, tenga el formato correcto y que sea un RUT real.
 */
public class ValidadorRut {

    /**
     *
     * Valida si el texo está vacío y si corresponde a un rut real.
     *
     * @param rut RUT de la persona
     * @return true si es RUT real o false si es un RUT incorrecto (boolean).
     */
    public static boolean validar(String rut) {
        if (rut == null || rut.trim().isEmpty() || !rut.contains("-")) {
            return false;
        }

        try {
            String rutLimpio = rut.replace(".", "").trim().toUpperCase();

            if (!rutLimpio.matches("[0-9]{7,8}-[0-9K]")) {
                return false;
            }

            String[] partesRut = rutLimpio.split("-");
            String cuerpoRut = partesRut[0];
            String digitoVerificador = partesRut[1];

            int cuerpoInt = Integer.parseInt(cuerpoRut);

            int suma = 0;
            int multiplicador = 2;

            while (cuerpoInt > 0) {
                int num = cuerpoInt % 10;
                suma += (num * multiplicador);
                multiplicador++;

                if (multiplicador > 7) {
                    multiplicador = 2;
                }
                cuerpoInt = cuerpoInt / 10;
            }

            int resto = suma % 11;
            int resultadoFinal = 11 - resto;

            String dvEsperado;
            if (resultadoFinal == 11) {
                dvEsperado = "0";
            } else if (resultadoFinal == 10) {
                dvEsperado = "K";
            } else {
                dvEsperado = String.valueOf(resultadoFinal);
            }

            return digitoVerificador.equals(dvEsperado);


        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
