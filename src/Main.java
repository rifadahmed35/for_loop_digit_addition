public class Main {
    public static void main(String[] args){
        int num=4321,  digit, sum=0;
        do {
            digit= num%10;
            sum=sum+digit;
            num=num/10;
        } while(num!=0); {
            System.out.println(sum);
        }

    }
}