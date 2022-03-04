import org.junit.jupiter.api.Test;

public class TestProblema3 {
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
            if (Problema2.esNumeroMultiploDe3(i)) {
                cadena += "Fizz";
            } else if (Problema2.esNumeroMultiploDe5(i)) {
                cadena += "Buzz";
            } else {
                cadena += i;
            }
        }
        return cadena;
    }
    public String devuelveCadena2(){
        String cadena = "";
        for (int i = 10; i < 15; i++) {
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

    private String ProblemaTest2(){
        String cadena = "";
        for (int i = 10; i < 15; i++){
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
    public String devuelveCadena3(){
        String cadena = "";
        for (int i = 1; i < 20; i++) {
            if (i % 3 == 0) {
                cadena += "Fizz";
            } else if (i % 5 == 0) {
                cadena += "Buzz";
            }else if (i % 7 == 0) {
                cadena += "Foo";
            }else if (i % 11 == 0) {
                cadena += "Boo";
            } else {
                cadena += i;
            }
        }
        return cadena;
    }
    private String ProblemaTest3(){
        String cadena = "";
        for (int i = 1; i < 20; i++){
            if (Problema3.esNumeroMultiploDe3(i)) {
                cadena += "Fizz";
            } else if (Problema3.esNumeroMultiploDe5(i)) {
                cadena += "Buzz";
            }else if (Problema3.esNumeroMultiploDe7(i)) {
                cadena += "Foo";
            }else if (Problema3.esNumeroMultiploDe11(i)) {
                cadena += "Boo";
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
    // Se ha creado el test1 para que funcione con cualquier tipo de numero con lo que no hay cambios
    @Test
    public void Test2(){
        if (ProblemaTest2().equalsIgnoreCase(devuelveCadena2())){
            System.out.println("La prueba ha resultado correcta");
        }
        else {
            System.out.println("La prueba ha resultado falsa");
        }
    }
    @Test
    public void Test3(){
        if (ProblemaTest3().equalsIgnoreCase(devuelveCadena3())){
            System.out.println("La prueba ha resultado correcta");
        }
        else {
            System.out.println("La prueba ha resultado falsa");
        }
    }
    
}
