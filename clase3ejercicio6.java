import java.util.Scanner;

public class clase3ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int notas = 0;
        int aprobados = 0;
        int maxima = 0;
        int minima = 100;
        int negativa = 1;
        int estudiantes = 0;
        while(negativa!=0){
            System.out.print("ingrese la nota de cada estudiante: ");
            int nota = scanner.nextInt();
            if(nota>0){
                notas += nota;
                estudiantes += 1;
            }
            if(nota>=70){
                aprobados += 1;
            }
            if(nota>maxima){
                maxima = nota;
            }
            if(nota<minima){
                if(nota>=0){
                    minima = nota;
                }
            }
            int promedio = notas/estudiantes;
            System.out.print("estudiantes aprobados: "+aprobados+"\npromedio de las notas:"+promedio+"\nnota maxima:"+maxima+"\nnota minima:"+minima+"\n");
            if(nota<0){
                negativa = 0;
            }
        }
        
    } 
}
