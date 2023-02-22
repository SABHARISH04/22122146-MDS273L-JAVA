import java.util.Scanner;

public class Lab3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        int len = scanner.nextInt();
        int[] myNum =new int[len];
        int j;
        for(j=0;j<len;j++){
            System.out.println("Enter a number: ");
            int number=scanner.nextInt();
            myNum[j]=number;
        }
        System.out.println("Enter 1 to find mean\nEnter 2 to find mode\nEnter 3 to find median: ");
        int options=scanner.nextInt();
        switch (options) {
            case 1:
                mean();
                break;
        
            default:
                break;
        }
        
    }
    public static void mean(int[] myNum) {
        float mean=0;
        int sum=0,count;
        for(count=0;count<len;count++){
            sum+=myNum[count];
        }
        mean=sum/len;
        System.out.println("Mean is : "+mean);
    }

}
