package practice.BarryBird;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class DoPayrollTwo {
    public static void main(String[] args) throws IOException {
        Scanner diskScanner = new Scanner(new File("EmployeeInfo.txt"));
        for(int empNum = 1; empNum <= 3; empNum++){
            payOneEmployee(diskScanner);
        }

    }

    static void payOneEmployee(Scanner aScanner){
        EmployeeTwo anEmployee  = new EmployeeTwo();
        anEmployee.setName(aScanner.nextLine());
        anEmployee.setJobTitle(aScanner.nextLine());
        anEmployee.cutCheck(aScanner.nextDouble());
        aScanner.nextLine();
    }
}
