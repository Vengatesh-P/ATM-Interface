import java.util.*;
public class ATMInterface{
   ATMInterface(){
    double balance=10000;
    int atmPin=8432;
    System.out.println("ATM Machine");
    System.out.println();
    System.out.println("Choose 1 for Withdraw");
    System.out.println("Choose 2 for Deposit");
    System.out.println("Choose 3 for Check Balance");
    System.out.println("Choose 4 for Exit"); 
    System.out.println();
    Scanner input=new Scanner(System.in);
    System.out.println("Insert Your ATM card");
    System.out.println();
    while(true){
        System.out.println("Choose the Operation:");
        int option=input.nextInt();
       
        if(option==1){
            System.out.println("Enter PIN Number:");
            int pin=input.nextInt();
            if(pin==atmPin){
                System.out.println("Account Authorized");
                System.out.println(" Enter amount to withdraw:");
                int withdrawal=input.nextInt();
                System.out.println("completed withdrawal");
                System.out.println("collect your cash");
                if(balance>=withdrawal){
                balance=balance-withdrawal;
                System.out.println("");
                }
                else{
                 System.out.println("Your account balance is low!! ");
                }
            }
            else{
                System.out.println("Please Enter Valid PIN Number");
            }
        }
            else if(option==2){
                System.out.println("Enter PIN Number:");
                int pin=input.nextInt();
                if(pin==atmPin){
                System.out.println("Account Authorized");
                System.out.println("Enter Amount to Deposit:");
              
                int deposite=input.nextInt();
                balance=balance+deposite;
                System.out.println("Your Money has been successfully deposited ");
                }
                else{
                    System.out.println("Please Enter Valid PIN Number");
                    System.exit(0);
                }
            }
            else if(option==3){
                 System.out.println("Enter PIN Number:");
                 int pin=input.nextInt();
                 if(pin==atmPin){
                 System.out.println("Account Authorized");
                 System.out.println(" Your Current balance is:"+balance);
            }
            else{
                System.out.println("Please Enter Valid PIN Number");
            }
        }
        else if(option==4){
             System.out.println("Collect Your ATM card");
             System.out.println("Thank you for using ATM Machine!!");
        }
    }

}
public static void main(String[]args){
    new ATMInterface();
}
}
