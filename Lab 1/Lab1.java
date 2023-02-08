import java.util.Scanner;

public class Lab1{
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            
            System.out.print(("enter your name: "));
            String name=scanner.nextLine();

            System.out.print("enter your age: ");
            int age = scanner.nextInt();

            System.out.print("enter your gender: ");
            char gender=scanner.next().charAt(0);

            System.out.print("Enter your state: ");
            String state=scanner.next();

            if (gender == 'm') {
                System.out.println("Gender: MALE");
            } else if (gender == 'f') {
                System.out.println("Gender: FEMALE");
            }

            switch (state) {
                case "kerala":
                case "TamilNadu":
                case "Karnataka":
                    System.out.println("The student is from the southern states of India.");
                    break;
                case "Maharashtra":
                case "Goa":
                case "Gujarat":
                    System.out.println("The student is from the western states of India.");
                    break;
                case "West Bengal":
                case "Orissa":
                case "Bihar":
                    System.out.println("The student is from the eastern states of India.");
                    break;
                case "Punjab":
                case "Haryana":
                case "UttarPradesh":
                    System.out.println("The student is from the northern states of India.");
                    break;
                default:
                    System.out.println("Invalid state.");
                    break;
            }


        
        }
}