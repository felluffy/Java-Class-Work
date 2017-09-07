public class Part2
{
    String findSimpleGene(String DNA, String startCodon, String endCodon)
    {
        int start = DNA.indexOf(startCodon);
        int end = DNA.indexOf(endCodon, start + 3);
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
        System.out.println("Gene: " + gene);
        
        //NO ATG
        DNA = "ATACGATATTATAACCCGAGAT";
        gene = findSimpleGene(DNA, "ATG", "TAA");
        System.out.println("Gene: " + gene);
        
        //NO TAA
        DNA = "ATGACGATATTATACCCGAGAT";
        gene = findSimpleGene(DNA, "ATG", "TAA");
        System.out.println("Gene: " + gene);
        
        //Multiple of 3
        DNA = "ATGACGATATAATATAACCCGAGAT";
        gene = findSimpleGene(DNA, "ATG", "TAA");
        System.out.println("Gene: " + gene);
        
        //Not a multiple of 3
        DNA = "ATGACGATAGTAATATAACCCGAGAT";
        gene = findSimpleGene(DNA, "ATG", "TAA");
        System.out.println("Gene: " + gene);
        
        //System.out.println("Finished testSimpleGene");
    }
}
