package lab4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Benjamin
 */
public class HrHead {

    private List<Employee> employee;

    public HrHead() {
        employee = new ArrayList();
    }

    public void hireEmployee(String firstName, String lastName, String ssn) {
        Employee e = new Employee(firstName, lastName, ssn);
        e.setFirstName(firstName);
        e.setLastName(lastName);
        e.setSsn(ssn);
        employee.add(e);
        orientEmployee(e);
    }

    public void orientEmployee(Employee e) {
        e.doFirstTimeOrientation("A101");
    }

    public void outputReport(String ssn) {
        Employee e = null;
        for (Employee emp : employee) {
            if (emp.getSsn().equals(ssn)) {
                e = emp;
                break;
            } else {
                return;
            }
        }
        if (e.isMetWithHr() && e.isMetDeptStaff() && e.isReviewedDeptPolicies() && e.isMovedIn()) {
            e.getReportService().outputReport();
        }
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

}
