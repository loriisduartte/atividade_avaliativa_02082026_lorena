public class App {
    public static void main(String[] args) throws Exception {
       
        double nota1 = 30.50;
        double nota2 = 25.50;
        double nota3 = 25.60;
        String notafinal = "Nota Final: ";
        String mediadoaluno = "Média Final: ";            
        double totalnota = nota1 + nota2 + nota3;
        double mediafinal = (nota1 + nota2 + nota3) / 3;
        String resultadofinal = "======= Resultado Final =========";

        System.out.println(resultadofinal);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2); 
        System.out.println("Nota 3: " + nota3);         
        System.out.println(notafinal + totalnota);
        System.out.println(mediadoaluno + mediafinal);

    }
}
