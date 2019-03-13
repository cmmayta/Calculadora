package servicio;


public class CalculadoraService {
    
    public static String respuesta(int nro1, int nro2, char ope){
        String resultado;
        switch (ope) {
            case '0':
                resultado = "Selecciona un operador";
                break;
            case '+':
                resultado = String.valueOf(nro1 + nro2);
                break;
            case '-':
                resultado = String.valueOf(nro1 + nro2);
                break;
            case '*':
                resultado = String.valueOf(nro1 + nro2);
                break;
            case '/':
                resultado = String.valueOf(nro1 + nro2);
                break;
        }
        return resultado;
    }
}
