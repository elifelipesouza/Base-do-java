package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Eli", "Gui", "Mi", "Eliza");

        // for tradicional
        for(int i = 0; i < aprovados.size(); i++){
            System.out.println(aprovados.get(i) );                         
        }

        // foreach
        for(String nome: aprovados){
            System.out.println(nome);
        }

        // while
        Iterator<String> it = aprovados.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // stream
        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println); // laço interno
    }
}
