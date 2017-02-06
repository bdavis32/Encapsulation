/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Benjamin
 */
public class ReportService {

    private Employee employee;

    public ReportService(Employee employee) {
        this.employee = employee;
    }
    public void outputHRMeeting(){
        System.out.println(employee.getFirstName() + " " + employee.getLastName() + " met with Hr on ");
    }
}
