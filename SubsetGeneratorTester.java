import java.util.Collections;
import java.util.ArrayList;

/**
   This program tests the subset generator.
*/
public class SubsetGeneratorTester
{
   public static void main(String[] args)
   {
      SubsetGenerator generator 
            = new SubsetGenerator("rum");
      
      ArrayList<String> subsets = generator.getSubsets();
      // Sort the result for checking 
      Collections.sort(subsets);
      System.out.println(subsets);
      System.out.println("Expected: [, m, r, rm, ru, rum, u, um]");
   }
}
