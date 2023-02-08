package Lab2;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner = new Scanner(System.in);
        String[] =new String[1024];
        int count= 0;
        System.out.println("MainMenu");
        System.out.println("1. Enter a name");
        System.out.println("2. Search a name");
        System.out.println("3. Remove a name");
        System.out.println("4. Show all names");
        System.out.println("5. Exit");
        int option =Scanner.nextInt()
        switch (option) {
            case 1:
            enterName();
                
                break;
            case 2:
            searchName();
            break;
            case 3:
            Removename();
            break;
            
            
        
            default:
                break;
        }


    }
}
