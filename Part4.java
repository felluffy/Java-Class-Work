import edu.duke.*;
public class Part4
{
    void check()
    {
        URLResource url = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        for(String s: url.words())
        {
            //if(s == "youtube.com")
            //System.out.println(s + " ");    
            s = s.toLowerCase();
            int index = s.indexOf("youtube.com");
            if(index != -1)
            {
                index = s.indexOf("\"");
                int endIndex = s.indexOf("\"", index + 1);
                System.out.println(s.substring(index + 1, endIndex));
            }
        }
    }
}