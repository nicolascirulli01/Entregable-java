import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> miLista = new ArrayList<>();
        miLista.add(27);
        miLista.add(6);
        miLista.add(14);
        miLista.add(8);
        miLista.add(9);
        miLista.add(12);
        miLista.add(13);


        int cantidad = ListAnalyzer.contadorImpares(miLista);

        System.out.println( "Cantidad de nÃºmeros impares: " + cantidad ); 
        // Salida: Cantidad de nÃºemeros impares: 3

        List<Integer> numConsecutivos = ListAnalyzer.numerosConsecutivos(miLista);
        System.out.println("NÃºmeros consecutivos de la lista: ");
        for(int numero : numConsecutivos){
            System.out.println(numero);
            }
        //Salida: NÃºmeros consecutivos de la lista: [8, 9, 12, 13]
    }
}


