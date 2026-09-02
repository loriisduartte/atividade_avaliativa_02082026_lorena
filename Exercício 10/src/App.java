public class App {
    public static void main(String[] args) throws Exception {
        
       //ATIVIDADE ADAPTADA PARA UM PERSONAGEM DO JOGO LEAGUE OF LEGENDS:
       
        //Apresentação do personagem
        String apresentacaopersonagem ="======Apresentação do Personagem======"; 
        String nomedopersonagem = "Lux";
        String lane = "Mid / Suporte";
        String lore = "Demacia";
        String tipodepoder = "Mágico"; 
        
         //variáveis Early Game

        String estadoinicial ="======Early Game======";   
        int nivelinicial = 1;
        int vidaincial = 650;
        int danoinicial = 20;
        int moedasiniciais = 550;
        boolean statusdopersonagem = true;
        int moedasporkill = 400;

        // Variáveis Mid Game

        String estadomeio ="======Mid Game======";
        int nivelmid = nivelinicial + 9;
        double vidamid = vidaincial + (100 / 0.2);
        double danomid = danoinicial + (100 / 0.4);
        int moedasmid = moedasiniciais + (moedasporkill * 5);

        // Variáveis Late Game

        String estadofinal ="======Late Game======";
        int nivellate = nivelmid + 8;
        double vidalate = vidamid+ (100 / 0.4);
        double danolate = danomid + (100 / 0.6);
        int moedaslate = moedasmid + (moedasporkill * 10);      

                      
        //Apresentação do Personagem

        System.out.println(apresentacaopersonagem);
        System.out.println ("Nome: " + nomedopersonagem);
        System.out.println("Lane: " + lane);
        System.out.println("Lore do jogo: " + lore);
        System.out.println("Tipo de Poder: " + tipodepoder);
        

        //Estado Early Game

        System.out.println(estadoinicial);
        System.out.println("Nível Early Game " + nivelinicial);
        System.out.println("Vida Early Game: " + vidaincial);
        System.out.println("Dano Early Game: " + danoinicial);
        System.out.println("Moedas Early Game: " + moedasiniciais);
        System.out.println("Personagem Ativo? " + statusdopersonagem);


        // Estado Mid Game

        System.out.println(estadomeio);
        System.out.println("Nível Mid Game: " + nivelmid);
        System.out.println("Vida Mid Game: " + vidamid);
        System.out.println("Dano Mid Game: " + danomid);
        System.out.println("Moedas Mid Game: " + moedasmid);
        System.out.println("Personagem Ativo? " + statusdopersonagem);


        //Estado Late Game

        System.out.println(estadofinal);
        System.out.println("Nível Mid Game: " + nivellate);
        System.out.println("Vida Mid Game: " + vidalate);
        System.out.println("Dano Mid Game: " + danolate);
        System.out.println("Moedas Mid Game: " + moedaslate);
        System.out.println("Personagem Ativo? " + statusdopersonagem);

    }
}
