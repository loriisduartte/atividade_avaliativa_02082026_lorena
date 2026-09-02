public class App {
    public static void main(String[] args) throws Exception {
        
        String nomeDoProduto = "Mouse";
        double precoUnitario = 50.00;
        int quantidadeComprada = 3; 
        double totalaPagar = 150.00;
        String recibo = ("======Recibo da Compra======");

        double total = precoUnitario * quantidadeComprada;

        System.out.println (recibo);
        System.out.println ("Prduto:" + nomeDoProduto);
        System.out.println ("Preço do Produto:" + precoUnitario);
        System.out.println ("Quantidade comprada:" + quantidadeComprada);
        System.out.println ("Total a pagar:" + total);

    }
}
