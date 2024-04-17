package strings;

public class StringsFeatures {

    public static void main(String[] args) {
        System.out.println(identation("Teste margem 0",0));
        System.out.println(identation("Teste margem 1",1));
        System.out.println(identation("Teste margem 2",2));
        System.out.println(identation("Teste margem 3",3));

        String s = "Remove daqui em diante";
        System.out.println(s);
        System.out.println(trasnformString(s,6,s.length()));

        System.out.println("Texto blocks");
        System.out.println(textBlocks());
    }

    static String identation(String s, int identation){
        return s.indent(identation);
    }

    static  String trasnformString(String s, int deleteFrom, int deleteAt){
        return s.transform( value -> new StringBuilder(value).delete(deleteFrom, deleteAt).toString());
    }
    static  String textBlocks(){
        return """ 
                Agora é possivel fazer um bloco de textos
                dessa maneira.""";
    }
}
