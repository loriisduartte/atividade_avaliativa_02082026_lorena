public class App {
    public static void main(String[] args) throws Exception {
        
     int pontuação = 100;
     int pontosAdicionais = 75;
     String pontos = "Pontos Iniciais: ";
     String pontosextras = "Pontos Extras: ";
     String pontuacaoFinal = "Pontuação Final:";
     int totalpontos = pontuação + pontosAdicionais;
     String ficha = "=========Ficha de Pontos========";
     


     System.out.println(ficha);
     System.out.println(pontos + pontuação);
     System.out.println(pontosextras + pontosAdicionais);
     System.out.println(pontuacaoFinal + totalpontos);
     System.out.println("O score final é de 175");
    }
}
