import java.util.*;
import java.io.*;

class geraTeste {
  static Random seed = new Random();
  
  public static int randInt(int min, int max) {
    return seed.nextInt((max - min) + 1) + min;
  }
  
  public static void main(String[] args) {
    PrintWriter writer;
    try {
      if(args.length > 0) writer = new PrintWriter(args[0], "UTF-8");
      else writer = new PrintWriter("config.txt", "UTF-8");
    } catch(FileNotFoundException fnfe) {
      System.out.println(fnfe.getMessage());
      return;
    } catch(IOException io) {
      System.out.println(io.getMessage());
      return;
    }
    
    writer.println("100"); // capacidade da mochila
    
    int i = randInt(1,20); // número de ítens
    writer.println(i);
    
    for(;i > 0;i--) { // ítem
      writer.println(randInt(10,100)+" "+randInt(10,100));
    }
    
    writer.close();
  }
}