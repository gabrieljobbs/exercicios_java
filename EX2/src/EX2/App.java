package EX2;

    
import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)){
        Conta objetoConta=new Conta();
        System.out.println(objetoConta.nome_correntista+" "+objetoConta.numero_da_conta+" "+objetoConta.saldo);
        System.out.println("1.Mudar informações");
        objetoConta.op=leitor.nextInt();
        while (objetoConta.op==1){
        if (objetoConta.op==1){
            objetoConta.nome_correntista=leitor.next();
            objetoConta.saldo=leitor.nextInt();
            System.out.println("1.Depositar");
            System.out.println("2.Sacar");
            objetoConta.op_sq=leitor.nextInt();
       
            if (objetoConta.op_sq==1){
                System.out.println("Quando deseja depositar:");
                int dp=leitor.nextInt();
                int soma=objetoConta.saldo+dp;
                System.out.println("Seu saldo é: "+soma);

            }
            if (objetoConta.op_sq==2){
                System.out.println("Quando deseja retirar:");
                int dpm=leitor.nextInt();
                int subtrair=objetoConta.saldo-dpm;
                System.out.println("Sua conta contem: "+subtrair);

            }


            if ((objetoConta.op_sq!=1) && (objetoConta.op!=2)){
                System.out.println("Operação Invalida!");
            }
        }
        }   
            
    }
}
}