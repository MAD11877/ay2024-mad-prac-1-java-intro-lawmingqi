import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the total number of integer: ");
    int num = in.nextInt();

    ArrayList<Integer> data = new ArrayList<Integer>();
    for (int i = 0; i < num; i++) {
      System.out.print("> ");
      data.add(in.nextInt());
    }
    int maxValue = 0;
    int maxCount = 0;

    for (int i = 0 ; i < num; i++) {
      int count = 0;
      for (int j = 0; j < num; j++) {
        if (data.get(i) == data.get(j)) {
          count++;
        }
        if (count > maxCount){
          maxCount = count;
          maxValue = data.get(i);
        }
      } 
    }
    System.out.println(maxValue);
    
  }
}
