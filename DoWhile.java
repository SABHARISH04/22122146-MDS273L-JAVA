import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch;
        do{
            System.out.println("press y to continue: ");
            ch = scan.nextLine().charAt(0);
        }while(ch == "y"||ch="Y");
        
    }
    
}
