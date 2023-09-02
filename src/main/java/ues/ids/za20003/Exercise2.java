package ues.ids.za20003;

public class Exercise2 {
    public static String convertNumberToWordsV1(int num) {
        String[] units = { "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };
        String[] tens = { "", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta",
                "noventa" };

        if (num >= 0 && num < 10) {
            return units[num];
        } else if (num <= 99) {
            int tensDigit = num / 10;
            int unitsDigit = num % 10;
            if (unitsDigit == 0) {
                return tens[tensDigit];
            } else {
                return tens[tensDigit] + " y " + units[unitsDigit];
            }
        }
        return "Número fuera de rango";
    }

    public static String convertNumberToWordsV2(int num) {
        String[] units = { "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };
        String[] teens = { "diez", "once", "doce", "trece", "catorce", "quince" };
        String[] tens = { "", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta",
                "noventa" };

        if (num >= 0 && num < 10) {
            return units[num];
        } else if (num >= 10 && num < 16) {
            return teens[num - 10];
        } else if (num >= 16 && num <= 99) {
            int tensDigit = num / 10;
            int unitsDigit = num % 10;
            if (unitsDigit == 0) {
                return tens[tensDigit];
            } else {
                return tens[tensDigit] + " y " + units[unitsDigit];
            }
        }
        return "El numero esta fuera del rango";
    }
}
