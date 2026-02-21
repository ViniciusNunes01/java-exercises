package list.exercicio_employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<Employee>();

		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Employee #" + i + ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			Employee emp = new Employee(id, name, salary);

			employees.add(emp);
		}

		System.out.println();
		System.out.println("Enter the employee id that will have salary increase :");
		Integer idSearch = sc.nextInt();
		Integer idFound = position(employees, idSearch);
		if (idFound == -1) {
			System.out.println("This id does not exist!");
		} else {

			System.out.println("Enter the percentage: ");
			Double percentage = sc.nextDouble();
			employees.get(idFound).increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees: ");

		for (Employee emp : employees) {
			System.out.println(emp);
		}

		sc.close();

	}

	public static int position(List<Employee> list, Integer idSearch) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(idSearch)) {
				return i;
			}
		}

		return -1;

	}

}
