public class App {
    public static void main(String[] args) throws Exception {
        

        int anoNacimento = 1997;
        int anoAtual = 2026;
        String nome = "Lorena Duarte";
        String idade = "Idade Atual: ";
        String idadeFutura = "Idade futura (5 anos): ";
        int idadeAtual = anoAtual - anoNacimento;
        int idadecincoanos = 5 + idadeAtual;
        String ficha = "=======Idade em 5 anos ========";

        System.out.println(ficha);
        System.out.println(nome);
        System.out.println(idade + idadeAtual);
        System.out.println(idadeFutura + idadecincoanos);
        
    }
}
