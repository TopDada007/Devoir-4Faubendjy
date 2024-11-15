package main;

import employee.Employee;
import employee.Manager;
import employee.EmployeeManager;
import department.Department;
import department.DepartmentManager;
import file.FileHandler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        // Gestionnaire de départements
        DepartmentManager departmentManager = new DepartmentManager();
        
        // Ajouter des départements
        System.out.print("Nom du département: ");
        String departmentName = scanner.nextLine();
        Department department = new Department(departmentName);
        departmentManager.addDepartment(department);

        // Gestionnaire d'employés
        EmployeeManager employeeManager = new EmployeeManager();

        // Ajouter des employés
        System.out.print("Nom de l'employé: ");
        String employeeName = scanner.nextLine();
        System.out.print("Salaire de l'employé: ");
        double employeeSalary = scanner.nextDouble();
        scanner.nextLine(); // pour consommer la nouvelle ligne

        Employee employee = new Employee(employeeName, employeeSalary);
        employeeManager.addEmployee(employee);

        // Ajouter un manager
        System.out.print("Nom du manager: ");
        String managerName = scanner.nextLine();
        System.out.print("Salaire du manager: ");
        double managerSalary = scanner.nextDouble();
        scanner.nextLine(); // pour consommer la nouvelle ligne
        System.out.print("Département du manager: ");
        String managerDepartment = scanner.nextLine();
        
        Manager manager = new Manager(managerName, managerSalary, managerDepartment);
        employeeManager.addEmployee(manager);

        // Afficher les employés
        System.out.println("\nListe des employés:");
        employeeManager.displayEmployees();

        // Sauvegarder les employés dans un fichier
        FileHandler fileHandler = new FileHandler();
        fileHandler.saveEmployeesToFile(employeeManager.getEmployees(), "employees.txt");
        
        // Fermer le scanner
        scanner.close();
    }
}