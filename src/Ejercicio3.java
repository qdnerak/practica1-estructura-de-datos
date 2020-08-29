import java.util.Scanner;

/*Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno (comprendidas
entre 0 y 10). A continuación debe mostrar todas las notas, la nota media, la nota más alta que ha
sacado y la menor.*/
public class Ejercicio3 {
    //definir vector-arreglo notas
    int[]notas;
    Scanner scanner;
    //metdo constructor
    public Ejercicio3(){
        notas= new int[5];
        scanner= new Scanner (System.in);

    }

    //metodo ejecutar
    public void ejecutar(){
        //ingresamos notas por teclado entre 0-10
        for (int i = 0; i < notas.length; i++) {
            System.out.println("notas["+i+"]:");
            int nota= scanner.nextInt();

            notas[i]=nota;
        }
        //mostramos el contenido de notas
        double suma=0;
        double promedio;
        int minimo=10;
        int maximo=0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas["+i+"]"+notas[i]);
            suma= suma+ notas[i];
            if (notas[i]<minimo){
                minimo = notas[i];
            }
            if (notas [i]> maximo){
                maximo= notas[i];
            }
        }
        promedio= suma / notas.length;

        System.out.println("Promedio es:"+ promedio);
        System.out.println("Maximo:"+ maximo);
        System.out.println("Minimo:"+ minimo);

    }
}
