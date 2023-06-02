import java.util.Scanner;
public class clase3ejercico3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese un valor: ");
        int valor = scanner.nextInt();
        String resultado = "";
        String simbolo = "*";
        for(int i = 0;i<valor;i++){
            resultado += simbolo;
            System.out.println(resultado);
       }  
    }
}

