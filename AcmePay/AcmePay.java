import java.util.Scanner;

public class AcmePay {
    public static void main(String[] args) throws Exception {
        int shift;
        double hoursWorked;
        int retirementInput;
        double hourlyRate = 0;
        double regularPay = 0;
        double overtimePay = 0;
        double overtimeHours;
        double retirementDeduction = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter shift - 1, 2, or 3: ");
        shift = input.nextInt();
        System.out.print("Please enter hours worked: ");
        hoursWorked = input.nextDouble();
        boolean retirementParticipation = false;

        if (shift == 2 || shift == 3) {
            System.out.print("Do you want to participate in the retirement plan?\n" +
                             "Enter 1 for Yes and 2 for No: ");
            retirementInput = input.nextInt();
            if (retirementInput == 1) {
                retirementParticipation = true;
            }
        }

        if (shift == 1) {
            hourlyRate = 17;
        } else if (shift == 2) {
            hourlyRate = 18.5;
        } else if (shift == 3) {
            hourlyRate = 22;
        }

        if (hoursWorked > 40) {
            overtimeHours = hoursWorked - 40;
            regularPay = 40 * hourlyRate;
            overtimePay = overtimeHours * (hourlyRate * 1.5);
        } else {
            regularPay = hoursWorked * hourlyRate;
        }

        if (retirementParticipation) {
            retirementDeduction = (regularPay + overtimePay) * 0.03;
        }
        double netPay = regularPay + overtimePay - retirementDeduction;
        System.out.println("Hours worked is   " + hoursWorked);
        System.out.println("Hourly pay rate is " + hourlyRate);
        System.out.println("Regular pay is     " + regularPay);
        System.out.println("Overtime pay is    " + overtimePay);
        System.out.println("Retirement deduction is " + retirementDeduction);
        System.out.println("Net pay is         " + netPay);
    }
}
