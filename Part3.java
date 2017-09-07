public class Part3
{
    boolean twoOccurences(String stringa, String stringb)
    {
        int count = 0;
        //for(int index = 0; index != -1; index = stringb.indexOf(stringa, index + stringa.length()))
        //    count++;
        int index = 0 - stringa.length();
        do
        {
            index = stringb.indexOf(stringa, index + stringa.length());
            if(index != -1)
                count++;
        }while(index != -1);
       
        if(count < 2)
            return false;
        else
            return true;
    }
    void test()
    {
        String stringa = "by";
        String stringb = "A story by Abby Long";
        System.out.println("First string: " + stringa + "\nSecond string: " + stringb + "\nThey match?: " + twoOccurences(stringa, stringb));
        stringa = "a";
        stringb = "banana";
        System.out.println("First string: " + stringa + "\nSecond string: " + stringb + "\nThey match?: " + twoOccurences(stringa, stringb));
        stringa = "atg";
        stringb = "ctgtatgta";
        System.out.println("First string: " + stringa + "\nSecond string: " + stringb + "\nThey match?: " + twoOccurences(stringa, stringb));
    }
}