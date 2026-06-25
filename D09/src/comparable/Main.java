package comparable;

import java.util.Arrays;
import java.util.Scanner;

class Employee implements Comparable<Employee> {
    public int empId;
    String name;
    double salary;

    public void acceptEmployee(Scanner sc){
        System.out.print("Enter the Employee ID :");
        this.empId = sc.nextInt();
        System.out.print("Enter the Employee Name :");
        this.name = sc.next();
        System.out.print("Enter the Employee Salary :");
        this.salary = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "Employee :" + "Emp Id :" + empId + ", Name='" + name + '\'' + ", Salary=" + salary ;
    }

    @Override
    public int compareTo(Employee o) {
        return this.empId - o.empId;
    }



}

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Employees : ");
        int size = sc.nextInt();

        Employee[] arr = new Employee[size];
        int choise = 0;
        boolean exit = false;

        while(!exit){

            System.out.println("\n01.Add Employee");
            System.out.println("02.Display Employee by ID");
            System.out.println("03.Sort Employee by EmpId");
            System.out.println("04.Display All Employees");
            System.out.println("05.Exit");
            System.out.print("Enter option : ");
            choise = sc.nextInt();
            switch (choise){
                case 1 :
                  for(int i = 0; i < size; i++) {

                      if(arr[i] == null) {
                            arr[i] =new Employee();
                            arr[i].acceptEmployee(sc);}
                      else System.out.println("Data is available");
                  }
                  break;

                case 2 :
                    System.out.print("Enter Employee ID :");
                    int Id = sc.nextInt();
                    for (Employee e1 : arr){
                        if(e1.empId == Id){ System.out.println(e1.toString());
                        break;}
                    }
                    System.out.println("Not found !");
                    break;
                case 3 :
                    Arrays.sort(arr);
                    for (Employee e : arr)
                        System.out.println(e.toString());
                    break;


                case 4 :
                    for (Employee e : arr)
                        System.out.println(e.toString());
                    break;
                case 5:
                    exit = true;
                    break;

            }
        }

  }
}
