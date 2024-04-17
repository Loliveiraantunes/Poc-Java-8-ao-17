package pattern.matcher;

public class PatternMatching {
    public static void main(String[] args) {
        System.out.println(formatter(1));
    }

    static String formatter(Object object){
        String format = "invalid";
        if ( object instanceof Integer i){
            return  String.format("Integer %d",i);
        } else if ( object instanceof  Long l && !l.equals(0)) {
            return  String.format("Long %d",l);
        } else if ( object instanceof  Double d) {
            return  String.format("Double %f",d);
        } else if ( object instanceof  String s) {
            return  String.format("Double %s",s);
        }

    // Foi implementado na versão 17 como Experimental sendo possível utilizar colocando o parametro --enable-preview na execução o Java, mas foi efetivamente lançado na versão 21.
    //        switch (objec){
    //            case Integer i ->  String.format("Integer %d",i);
    //            case Long l && !l.equals(0)) ->  String.format("Long %d",l);
    //            case Double d  -> String.format("Double %f",d);
    //            case String s -> String.format("Double %s",s);
    //        }

        return format;
    }




}
