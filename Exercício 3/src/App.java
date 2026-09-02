public class App {
    public static void main(String[] args) throws Exception {
        
       String nomedoProduto = "Teclado";
       double precoUnitario = 120.00;
       int quantidadeEmestoque =15;
       boolean disponibilidade = true;
       String FichadoProduto = ("========Ficha do Produto=======");

       System.out.println(FichadoProduto);
       System.out.println("Produto:" + nomedoProduto);
       System.out.println("Preço:" + precoUnitario);
       System.out.println("Quantidade em estoque:" + quantidadeEmestoque);
       System.out.println("Produto Disponível: " + disponibilidade);
    }
}
