import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("İsim giriniz");
            String name = scan.next();

            System.out.println("Calisma saatini giriniz ");
            int workHours = scan.nextInt();

            System.out.println("Ise girme yilini giriniz");
            int hireYear = scan.nextInt();

            System.out.println("Mevcut maasinizi giriniz:");
            double salary = scan.nextDouble();

            Employee employee = new Employee(name,salary,workHours,hireYear);
            double totalSalary = employee.salary - employee.tax() + employee.bonus();

            System.out.print("Name of employee:" + name);
            System.out.println("Tax" + employee.tax());
            System.out.println("Bonus" + employee.bonus());
            System.out.println("Increase" + employee.increase());
            System.out.println("Total salary with tax and bonus:" + totalSalary);
            System.out.println("Total salary with increase" +(totalSalary + employee.increase()) );


        }
}
