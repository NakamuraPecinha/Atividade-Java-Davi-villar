import java.util.Scanner;

public class Ex1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a = 0,b = 0;
        System.out.print("Escreva o primeiro valor:");
        a = scan.nextInt();

        while(b == 0){
            System.out.print("Escreva o segundo valor:");
            b = scan.nextInt();
            if(b == 0){
                System.out.println("VALOR NAO VALIDADO");
            }
        }

        System.out.printf("Divisão %d / %d = %.2f \n",a,b,(float)a/b);
        

        scan.close();
    }
}