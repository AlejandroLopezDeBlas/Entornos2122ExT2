import org.junit.jupiter.api.Test;

public class TestProblema1 {
    public String devuelveCadena(){
        String cadena = "";
        for (int i = 1; i < 20; i++) {
            if (i % 3 == 0) {
                cadena += "Fizz";
            } else if (i % 5 == 0) {
                cadena += "Buzz";
            } else {
                cadena += i;
            }
        }
        return cadena;
    }

    private String ProblemaTest1(){
        String cadena = "";
        for (int i = 1; i < 20; i++){
            if (Problema1.esNumeroMultiploDe3(i)) {
                cadena += "Fizz";
            } else if (Problema1.esNumeroMultiploDe5(i)) {
                cadena += "Buzz";
            } else {
                cadena += i;
            }
        }
        return cadena;
    }

    @Test
    public void Test1(){
        if (ProblemaTest1().equalsIgnoreCase(devuelveCadena())){
            System.out.println("La prueba ha resultado correcta");
        }
        else {
            System.out.println("La prueba ha resultado falsa");
        }
    }
}
