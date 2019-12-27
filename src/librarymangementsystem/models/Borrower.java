/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarymangementsystem.models;

/**
 *
 * @author USER
 */
public class Borrower {
    
    
    private String first_Name;
    private String middle_Name;
    private String last_Name;
    private String gender;
    private String reg_No;
    private int student_ID;
    private String address;
    private String phone_Number;
    private String nic_No;
    private String birth_Day;

    public Borrower() {
    }

    public Borrower(String first_Name, String middle_Name, String last_Name, String gender, String reg_No, int student_ID, String address, String phone_Number, String nic_No, String birth_Day) {
        this.first_Name = first_Name;
        this.middle_Name = middle_Name;
        this.last_Name = last_Name;
        this.gender = gender;
        this.reg_No = reg_No;
        this.student_ID = student_ID;
        this.address = address;
        this.phone_Number = phone_Number;
        this.nic_No = nic_No;
        this.birth_Day = birth_Day;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getMiddle_Name() {
        return middle_Name;
    }

    public void setMiddle_Name(String middle_Name) {
        this.middle_Name = middle_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getReg_No() {
        return reg_No;
    }

    public void setReg_No(String reg_No) {
        this.reg_No = reg_No;
    }

    public int getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(int student_ID) {
        this.student_ID = student_ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }

    public String getNic_No() {
        return nic_No;
    }

    public void setNic_No(String nic_No) {
        this.nic_No = nic_No;
    }

    public String getBirth_Day() {
        return birth_Day;
    }

    public void setBirth_Day(String birth_Day) {
        this.birth_Day = birth_Day;
    }

    
    
    
  
}
