package exercicio1503;

public class Principal {
public static void main(String[] args) {
        
        Cachorrinho Charlotte = new Cachorrinho();
        Charlotte.anos = 9;
        System.out.println("Charlotte tem 9 anos");
        Charlotte.peso = 9.7;
        System.out.println("Charlotte pesa 9 kilos e 700 gramas");
        Charlotte.raca = "sem raça definida";
        System.out.println("Charlotte não tem raça definida");
        
        Charlotte.comer();
        System.out.println("Status:" +Charlotte.acao);
        
        Cachorrinho Fritz = new Cachorrinho();
        Fritz.meses = 7;
        System.out.println("Fritz tem 7 meses");
        Fritz.peso = 8.2;
        System.out.println("Fritz pesa 8 kilos e 200 gramas");
        Fritz.raca = "Dachshund";
        System.out.println("Fritz é da raça Dachshund");
        
        Fritz.morder_e_mastigar();
        System.out.println("Status:" +Fritz.acao);

}
}
