public class MyString {

    public int returneazaNumarulCaracterelor(String text)
    {
        return text.length();
    }

    public String concateneaza (String text, String text1, String text2){
        return text+text1+text2;
    }

    public boolean incepeCuVocala (String text){
        char[] myStringArray = {'a', 'e', 'i', 'o', 'u'};
        char primaLitera = text.toLowerCase().charAt(0);

        for (Character vocala:myStringArray)
        {
            if (primaLitera==vocala)
            {
                return true;
            }
        }

       return false;
    }

    public String inverseazaString (String text){
        StringBuilder builder =  new StringBuilder(text);
        // se apeleaza functia reverse din obiectul Builder de tip StringBuilder
        builder.reverse();
        // convertim din StringBuilder in String cu ajutorul functiei to.String
        return builder.toString();
    }

    public static  int test () {
        return 123;
    }
}
