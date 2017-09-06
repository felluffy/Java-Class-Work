public class Part1
{
    String findSimpleGene(String DNA)
    {
        int start = DNA.indexOf("ATG");
        int end = DNA.indexOf("TAA", start + 3);
        if(end == -1 || start == -1 || (end - start)%3 != 0)
            return "";
        else 
            return DNA.substring(start, end + 3);
    }
    
    void testSimpleGene()
    {
        //NO ATG AND TAA
        String DNA = "ATACGATATTATACCCGAGAT";
        String gene = findSimpleGene(DNA);
        System.out.println("Gene: " + gene);
        
        //NO ATG
        DNA = "ATACGATATTATAACCCGAGAT";
        gene = findSimpleGene(DNA);
        System.out.println("Gene: " + gene);
        
        //NO TAA
        DNA = "ATGACGATATTATACCCGAGAT";
        gene = findSimpleGene(DNA);
        System.out.println("Gene: " + gene);
        
        //Multiple of 3
        DNA = "ATGACGATATAATATAACCCGAGAT";
        gene = findSimpleGene(DNA);
        System.out.println("Gene: " + gene);
        
        //Not a multiple of 3
        DNA = "ATGACGATAGTAATATAACCCGAGAT";
        gene = findSimpleGene(DNA);
        System.out.println("Gene: " + gene);
    }
}
