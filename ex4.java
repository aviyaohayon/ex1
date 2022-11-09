public class ex4 {
    public static void main(string[] args){
        scanner scanner =new scanner(system.in)
                int num;
                 int evenSum=0;
                 int oddSum=0;
                do{
        system.out.println("enter a num:");
                    num = scanner.nextInt;
                    if(num % 2==0){
                        evenSum+=num
                    }else {
                        oddSum+=num
                    }
    } while (num!=0);
        system.out.println("the evenSum is " +evenSum);
        system.out.println("the oddSum is " +oddSum);

}
