public class ex1 {
    public static void main(string[] args) {
        scanner scanner = new scanner(system.in)
                int positiveNum;
                do{
                    system.out.println("enter the positiveNum")
                    positiveNum= scanner.nextInt;

        } while (positiveNum<=0);
         int assembly=1;
            for (int i=1; i<= positiveNum; i++){
                assembly *= i;
            }
        system.out.println("the your assembly is" + assembly);
    }
}
