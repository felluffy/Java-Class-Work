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
}
