/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Benjamin
 */
public class Company {
    private HrHead hr;
    
    public Company(){
        hr = new HrHead();
    }
    public void hireEmployee(String firstName, String lastName, String ssn){
        hr.hireEmployee(firstName, lastName, ssn);
        hr.outputReport(ssn);
    }
    public HrHead getHr() {
        return hr;
    }

    public void setHr(HrHead hr) {
        this.hr = hr;
    }
    
}
