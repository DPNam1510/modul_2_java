package mvc_furama.view;
import mvc_furama.model.Employee;
import java.util.List;
import java.util.Scanner;
public class EmployeeView {
    private static final Scanner sc = new Scanner(System.in);
    public static void displayEmployees(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            if(employee!=null){
                System.out.println(employee);
            }else {
                break;
            }
        }
    }
    public static Employee inputDataToAddNew(){
        System.out.println("Enter Id: ");
        String id = sc.nextLine();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Date: ");
        String date = sc.nextLine();
        System.out.println("Enter Gender: ");
        String gender = sc.nextLine();
        System.out.println("Enter idCard: ");
        String idCard = sc.nextLine();
        System.out.println("Enter Phone Number: ");
        String phone = sc.nextLine();
        System.out.println("Enter Email: ");
        String email = sc.nextLine();
        System.out.println("Enter Skill: ");
        String skill = sc.nextLine();
        System.out.println("Enter Position: ");
        String position = sc.nextLine();
        System.out.println("Enter Salary: ");
        int salary = Integer.parseInt(sc.nextLine());
        return new Employee(id,name,date,gender,idCard,phone,email,skill,position,salary);
    }
    public static Employee inputDataToUpdate(){
        System.out.println("Enter Id: ");
        String id = sc.nextLine();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Date: ");
        String date = sc.nextLine();
        System.out.println("Enter Gender: :");
        String gender = sc.nextLine();
        System.out.println("Enter idCard: ");
        String idCard = sc.nextLine();
        System.out.println("Enter Phone Number: ");
        String phone = sc.nextLine();
        System.out.println("Enter Email: ");
        String email = sc.nextLine();
        System.out.println("Enter Skill: ");
        String skill = sc.nextLine();
        System.out.println("Enter Position: ");
        String position = sc.nextLine();
        System.out.println("Enter Salary: ");
        int salary = Integer.parseInt(sc.nextLine());
        return new Employee(id,name,date,gender,idCard,phone,email,skill,position,salary);
    }
}
