
package atm.methods;
import java.util.Scanner;

public class ATMMETHODS {
//initialize balance
    static int balance=10000;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int choice,again;
        
        System.out.println("SERVICES OFFERD ARE AS FOLLOWES\n"
                + "1:CHECK BALANCE\n"
                + "2:DEOSIT\n"
                + "3:WITHDRAW\n"
                + "4:Exit\n"
                + "Enter your coice using numbers\n");
        choice=scan.nextInt();
        switch(choice){
            case 1:
                checkbalance();
                break;
                
            case 2:
                deposit();
                break;
                
            case 3:
                withdraw();
                break;
            case 4:
            System.out.println("Thankyou for using the ATM\n");
            scan.close();
            return;
            
            default:
                System.out.println("Invalid choice try again");
                again=scan.nextInt();
        }
    }
    

//method to check bslsnce
public static void checkbalance(){
System.out.printf("your balance is %d:-",balance);
}
//method to deposit
public static void deposit(){
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter theamount you wish to deposit\n");
    int amount=scan.nextInt();
    
    if(amount>0){
        balance +=amount;
        System.out.printf("You have succesfully deposite ksh %d",amount);
        System.out.printf("Your new balance is ksh %d",balance);
    }
    else{
        System.out.printf("Invalid choice\n");
    }
}
public static void withdraw(){
    
}
}