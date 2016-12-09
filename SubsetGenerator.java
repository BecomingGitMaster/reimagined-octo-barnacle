import java.util.ArrayList;

/**
   This class generates subsets of a string.
*/
public class SubsetGenerator
{
   /**
      Constructs a subset generator.
      @param aWord the word to obtain subsets from
   */
   public SubsetGenerator(String aWord)
   {
      word = aWord;
   }

   public ArrayList<String> getSubsets()
   {
      ArrayList<String> aList = new ArrayList<String>();
      
      if(word.length() == 2)
      {
         aList.add(String.valueOf(word.charAt(0)));
         aList.add(String.valueOf(word.charAt(1)));
         aList.add(String.valueOf(word.charAt(0))+String.valueOf(word.charAt(1)));
         return aList;
      }
      
      String shorter = word.substring(1);
      SubsetGenerator shortGen = new SubsetGenerator(shorter);
      ArrayList<String> shortList = shortGen.getSubsets();
      
      for(String s : shortList)
      {
         aList.add(s);
         aList.add(word.charAt(0)+ s);
         
      }
      aList.add(String.valueOf(word.charAt(0)));

      return aList;
   }

   private String word;
}















