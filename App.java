import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
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

        System.out.println( "Cantidad de números impares: " + cantidad ); 
        // Salida: Cantidad de núemeros impares: 3

        List<Integer> numConsecutivos = ListAnalyzer.numerosConsecutivos(miLista);
        System.out.println("Números consecutivos de la lista: " + numConsecutivos.toString());
        //Salida: Números consecutivos de la lista: [8, 9, 12, 13]
    }

    public static class ListAnalyzer{
        public static int contadorImpares(List<Integer> lista){
            int contador = 0;
            for(int num : lista){
                if(num % 2 != 0)
                    contador++;
            }
            return contador;
        }
        public static List<Integer> numerosConsecutivos(List<Integer> lista){
            List<Integer> nums = new ArrayList<Integer>();
            int index = 0; 
            for(int num : lista){
                if(index < lista.size()){
                    if(index + 1 != lista.size() && lista.get(index+1).equals(num + 1)){
                        nums.add(num);
                    }
                }
                if(index != 0)
                {
                    if(lista.get(index-1).equals(num - 1)){
                        if(!nums.get(nums.size()-1).equals(num))
                            nums.add(num);
                    }
                }
                index++;
            }
            return nums;
        }
    }
}

