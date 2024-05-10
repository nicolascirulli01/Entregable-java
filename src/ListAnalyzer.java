import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class ListAnalyzer {
    
    public static int contadorImpares(List<Integer> lista){
        int contador = 0;
        for(Integer numero : lista){
            if (numero % 2 != 0){
            contador++;
            }
        }
        return contador;
    }


    public static List<Integer> numerosConsecutivos(List<Integer> lista){
        List<Integer> respuesta = new ArrayList<>();
        Set<Integer> conjuntoNumeros = new HashSet<>(); //para sacarme de encima los repetidos
        
        for(int i = 0; i < lista.size()-1 ;i++){
            if(lista.get(i+1) == lista.get(i) + 1){
                conjuntoNumeros.add(lista.get(i).intValue());
                conjuntoNumeros.add(lista.get(i+1).intValue());
            }
        }
        for(Integer numero : conjuntoNumeros){
            respuesta.add(numero);
        }

        return respuesta;
    }
}
