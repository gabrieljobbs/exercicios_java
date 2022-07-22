package exer10;



import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)){
        Ingresso objetoIngresso=new Ingresso();
        System.out.println("1.Ingresso comum");
        System.out.println("2.Ingresso vip");
        objetoIngresso.op=leitor.nextInt();
        if (objetoIngresso.op==1){
            int ingressonormal=objetoIngresso.ingressoNormal();
            int ingresso_vip=objetoIngresso.ingressoVip();
            System.out.println(ingressonormal/50+" Ingresso normal");
            System.out.println("A diferença vai ser de: "+(ingressonormal-ingresso_vip)+" do ingresso vip");
           

        }
        if (objetoIngresso.op==2){
            int ingresso_normal=objetoIngresso.ingressoNormal();
            int ingresso_vip=objetoIngresso.ingressoVip();
            System.out.println(ingresso_vip/60+" Ingresso vip");
            System.out.println("A diferença é de "+(ingresso_vip-ingresso_normal)+" para o ingresso normal");   
        }
       if ((objetoIngresso.op!=1) && (objetoIngresso.op!=2)){
            System.out.println("Operação invalida");
         

}
}
}
}
      
    