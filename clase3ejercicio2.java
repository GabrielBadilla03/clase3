import java.util.Scanner;

public class clase3ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = scanner.nextInt();
        int tabla = 0;
        if(tabla<11){
            for(int i = 0;i<11;i++){
                int mutiplicacion = tabla*numero;
                tabla += 1;
                System.out.print(numero+"*"+i+"="+mutiplicacion+"\n");
            }
        }else{
            tabla -= tabla;
            
        }
    }
}

