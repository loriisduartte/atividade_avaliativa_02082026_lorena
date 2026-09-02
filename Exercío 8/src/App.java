public class App {
    public static void main(String[] args) throws Exception {
        

double valorHora = 32.50;
double horassemanais = 44.00;
double horasMensais = 220.00;
String pagamentoSemanal = "Pagamento bruto Semanal: ";
String pagamentoMensal = "Pagamento bruto Mensal: ";
double totalsemanal = valorHora * horassemanais;
double toalmensal = valorHora * horasMensais;
String funcionario = "Lorena Duarte";
String recibo = "=======Holerite=======";

System.out.println(recibo);
System.out.println(funcionario);
System.out.println("Valor da Hora: " + valorHora);
System.out.println("Horas Semanais Trabalhadas: " +horassemanais);
System.out.println("Horas mensais trabalhadas: " + horasMensais);
System.out.println(pagamentoSemanal + totalsemanal);
System.out.println(pagamentoMensal + toalmensal);

    }
}
