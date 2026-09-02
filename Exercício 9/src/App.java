public class App {
    public static void main(String[] args) throws Exception {
        
        double celsius = 30.0;
        double  fahrenheit = celsius * 9.0 / 5.0 + 32;
        String temperatura = "======= Conversão de temperatura ========";

        System.out.println(temperatura);
        System.out.println("Temperatura em Celsius: " + celsius + "°C");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + "°F");
        
    }
}
