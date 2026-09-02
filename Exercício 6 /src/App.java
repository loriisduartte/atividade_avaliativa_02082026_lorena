public class App {
    public static void main(String[] args) throws Exception {
        
        double largura = 10.00;
        double altura = 5.00;
        String larguraretangulo ="Largura: ";
        String alturaretangulo = "Altura: ";
        String areatotal = "Área do Retângulo: ";
        String perimetrototal = "Perímetro do Retângulo: ";
        double area = largura * altura;
        double perimetro = 2 * (largura + altura);
        String ficha = "======== Retângulo ========";

        System.out.println(ficha);
        System.out.println(larguraretangulo + largura);
        System.out.println(alturaretangulo + altura);
        System.out.println(areatotal + area);
        System.out.println(perimetrototal + perimetro);
    }
}
