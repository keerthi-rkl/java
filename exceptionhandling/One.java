public class One {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            System.out.println("hello good afternoon");
        } catch (Exception e) {
            System.out.println("Arithmetic exception");
        }
        //System.out.println("hello 2good afternoon");

    
          finally{
          System.out.println(10 + 34);
          }
         
    }
}