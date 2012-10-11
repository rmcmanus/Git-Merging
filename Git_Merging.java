public class Test {
   private static int n;
   private int z;
   
   public void update(int amt) {
      z = amt;
      n = amt;
   }

<<<<<<< HEAD
   public int main() {
      Test test1 = new Test();
      Test test2 = new Test();
      test1.update(15);
      test2.update(25);
=======
   public void printUpdate() {
      System.out.println("The amount is now: " + z);
>>>>>>> printUpdate
   }
}
