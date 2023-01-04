package org.example.Company;

public class CompanyDatail {
    CompanyDatail(){}
    private Company company;
    CompanyDatail(Company company){
        this.company=company;
    }
    public void shout(){
        company.HR();
    }
}
