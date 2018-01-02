import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException; 

class Jfmt {

   private static int width = 75;

   private static void processLine(String line) {
      if (line.length() > 75) {
         System.out.println("blah");   
      } else
        System.out.println(line);
   }

   private static void openFile(String arg) {
      try { 
         File file = new File(arg);
         FileReader reader = new FileReader(file);
         BufferedReader buffReader = new BufferedReader(reader);
         String line = buffReader.readLine();

         while (line != null) {
            processLine(line);
            line = buffReader.readLine();
         }
      } catch (IOException e) { 
         throw new RuntimeException(e); 
      }
   }

   public static void main (String[] args) {
      for (int i = 0; i < args.length; i++) {
         // System.out.println(args[i]);   
         openFile(args[i]);
      }
   }
   
}
