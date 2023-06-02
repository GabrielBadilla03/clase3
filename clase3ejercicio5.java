import java.util.Scanner;

public class clase3ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la cantidad de estudiantes: ");
        int estudiantes = scanner.nextInt();
        int notas = 0;
        int aprobados = 0;
        int maxima = 0;
        int minima = 100;
        for(int i = 0;i<estudiantes;i++){
            System.out.print("ingrese la nota de cada estudiante: ");
            int nota = scanner.nextInt();
            notas += nota;
            if(nota>=70){
                aprobados += 1;
            }
            if(nota>maxima){
                maxima = nota;
            }
            if(nota<minima){
                minima = nota;
            }
        }
        int promedio = notas/estudiantes;
        System.out.print("estudiantes aprobados: "+aprobados+"\npromedio de las notas:"+promedio+"\nnota maxima:"+maxima+"\nnota minima:"+minima);
    } 
}

