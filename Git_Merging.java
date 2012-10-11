public class test {
   private static int n;
   private int z;
   
   public void update(int amt) {
      z = amt;
      n = amt;
   }

   public void printUpdate() {
      System.out.println("The amount is now: " + z);
   }
}
