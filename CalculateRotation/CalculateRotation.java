public class CalculateRotation 
{
  public static void main(String[] args)
  {
    if (args.length < 2) 
    {
      System.out.println("Please specify two strings to compare");
      System.exit(-1);
    }

    char[] firstArr = args[0].toCharArray();
    char[] secondArr = args[1].toCharArray();
    
    if (firstArr.length != secondArr.length)
    {
      System.out.println(args[0] + ", " + args[1] + " => -1");
      System.exit(0);
    }
    
    for (int i=0; i<firstArr.length; i++)
    {
      boolean matches = true;
      for (int j=0; j<firstArr.length; j++)
      {
        if (firstArr[j] != secondArr[(j+i) % firstArr.length])
        {
          matches = false;
          break;
        }
      }
      if (matches == true) 
      {
        System.out.println(args[0] + ", " + args[1] + " => " + i);
        System.exit(0);
      }
    }

    System.out.println(args[0] + ", " + args[1] + " => -1");
  }
}





