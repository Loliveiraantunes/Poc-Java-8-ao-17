package collections;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsTest {


    public static void main(String[] args) {
        System.out.println("valorMinEMaximo:");
        valorMinEMaximo();

        System.out.println("Stream of");
        toListDirect();
    }

    static  void valorMinEMaximo(){
        Integer i = Stream.of(1,2,3,4,5).collect(
                Collectors.teeing(Collectors.minBy(Integer::compareTo),Collectors.maxBy(Integer::compareTo),(min, max) ->{
                    //Fazer algo com os 2 parametros
                    System.out.println("Valor Min é "+ min.get());
                    System.out.println("Valor Max é "+ max.get());
                    return min.get() + max.get();
                }));
        System.out.println("Resultado da soma é de "+ i);
    }

    static  void toListDirect(){
        //Old way
        System.out.println( Stream.of(1,2,3,4,5).collect(Collectors.toList()));
        //New way
        System.out.println(Stream.of(1,2,3,4,5).toList());
    }
}
