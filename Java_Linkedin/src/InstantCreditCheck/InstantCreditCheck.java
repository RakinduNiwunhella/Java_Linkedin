package InstantCreditCheck;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class InstantCreditCheck {
    public static void main(String[] args) {
    //get input
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score: ");
        int score = scanner.nextInt();
        //check if the user is qualified
        boolean qualified = isUserQualified(score,salary);
    }
public static boolean isUserQualified(int creditScore, double salary){
        double requiredSalary = 25000;
        int requiredCreditScore = 700;
        if (creditScore >= requiredCreditScore && salary >= requiredSalary){
           return true;
        }else {
            System.out.println("Sorry, You've bee declined.");
            return false;
        }
    }

}
