package records;

import java.util.Date;

public class RecordsRunner {


    public static void main(String[] args) {
        RecorExample recorExample = new RecorExample("Teste", 1 , new Date());

        System.out.println(recorExample.toString());
    }

}
