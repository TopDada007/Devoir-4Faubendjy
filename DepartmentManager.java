package department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentManager {
    private List<Department> departments;

    public DepartmentManager() {
        departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void displayDepartments() {
        for (Department department : departments) {
            System.out.println(department);
        }
    }
}