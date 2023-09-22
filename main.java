public class OddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your limit");
        int limit= scanner.nextInt();
        int sum=0;

        for (int i=1;i<=10;i++){
            if(i%2 !=0){
                sum=i+sum;

            }
        }
        System.out.println("Sum of  odd numbers is : " + sum);
    }
}









