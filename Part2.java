public class Part2
{
    public static boolean isUpperCase(String s)
    {
        for (int i=0; i<s.length(); i++)
        {
            if (!Character.isUpperCase(s.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isLowerCase(String s)
    {
        for (int i=0; i<s.length(); i++)
        {
            if (!Character.isLowerCase(s.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
    String findSimpleGene(String DNA, String startCodon, String endCodon)
    {
        if(!isUpperCase(DNA) && !isLowerCase(DNA))
            return "";
        String DNACopy = DNA.toUpperCase();
        int start = DNACopy.indexOf(startCodon.toUpperCase());
        int end = DNACopy.indexOf(endCodon.toUpperCase(), start + 3);
        if(end == -1 || start == -1 || (end - start)%3 != 0)
            return "";
        else 
            return DNA.substring(start, end + 3);
    }
    
    void testSimpleGene()
    {
        //NO ATG AND TAA
        String DNA = "ATACGATATTATACCCGAGAT";
        String gene = findSimpleGene(DNA, "ATG", "TAA");
        System.out.println("\nDNA strand: " + DNA + "\nGene: " + gene);
        
        //NO ATG
        DNA = "ATACGATATTATAACCCGAGAT";
        gene = findSimpleGene(DNA, "ATG", "TAA");
        System.out.println("DNA strand: " + DNA + "\nGene: " + gene);
        
        //NO TAA
        DNA = "ATGACGATATTATACCCGAGAT";
        gene = findSimpleGene(DNA, "ATG", "TAA");
        System.out.println("DNA strand: " + DNA + "\nGene: " + gene);
        
        //Multiple of 3
        DNA = "ATGACGATATAATATAACCCGAGAT";
        gene = findSimpleGene(DNA, "ATG", "TAA");
        System.out.println("DNA strand: " + DNA + "\nGene: " + gene);
        
        //Not a multiple of 3
        DNA = "ATGACGATAGTAATATAACCCGAGAT";
        gene = findSimpleGene(DNA, "ATG", "TAA");
        System.out.println("DNA strand: " + DNA + "\nGene: " + gene);
        
        //Has both lower and upper case letters
        DNA = "aTgacgataTaatataacccgata";
        gene = findSimpleGene(DNA, "ATG", "TAA");
        System.out.println("DNA strand: " + DNA + "\nGene: " + gene);
        
        //has only lower case letters
        DNA = "atgacgatataatataacccgata";
        gene = findSimpleGene(DNA, "atg", "taa");
        System.out.println("DNA strand: " + DNA + "\nGene: " + gene);
  
        //System.out.println("Finished testSimpleGene");
    }
}
