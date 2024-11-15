package file;

import employee.Employee;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class FileHandler {

	    public void saveEmployeesToFile(List<Employee> employees, String fileName) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
	            for (Employee employee : employees) {
	                writer.write(employee.getName() + " - " + employee.getSalary());
	                writer.newLine();
	            }
	            System.out.println("Les informations des employés ont été sauvegardées dans le fichier.");
	        } catch (IOException e) {
	            System.out.println("Erreur lors de l'écriture dans le fichier: " + e.getMessage());
	        }
	    }
	}