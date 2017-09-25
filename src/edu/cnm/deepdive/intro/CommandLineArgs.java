package edu.cnm.deepdive.intro;

/**
 * this class demonstrates iteration over command line arguments
 *
 * @author Abdul Haseeb Gauba
 */
public class CommandLineArgs {

  private static final String ARGUMENT_FORMAT = "Argument %d = %s%n";

  /**
   * iterates through the arguments <code>args</code>, pringint each one.
   *
   * some more description ...
   *
   * @param args command line arguments
   */
  public static void main(String[] args){
    int i = args.length -1;
    while(i >= 0){
      String argument = args[i];
      System.out.printf(ARGUMENT_FORMAT, i+1 , argument);
      i--;
    }
  }
}
