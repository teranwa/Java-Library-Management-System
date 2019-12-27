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
public class User {
    
    private String first_Name;
    private String middle_Name;
    private String last_Name;
    private String gender;
    private String address;
    private String phone_Number;
    private String nic_no;
    private String birth_Day;
    private String  Privilege_Level;
    private String User_ID;
    private String password;

    

    public User() {
    }

    public User(String first_Name, String middle_Name, String last_Name, String gender, String address, String phone_Number, String nic_no, String birth_Day, String Privilege_Level, String User_ID,String password) {
        this.first_Name = first_Name;
        this.middle_Name = middle_Name;
        this.last_Name = last_Name;
        this.gender = gender;
        this.address = address;
        this.phone_Number = phone_Number;
        this.nic_no = nic_no;
        this.birth_Day = birth_Day;
        this.Privilege_Level = Privilege_Level;
        this.User_ID = User_ID;
         this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getNic_no() {
        return nic_no;
    }

    public void setNic_no(String nic_no) {
        this.nic_no = nic_no;
    }

    public String getBirth_Day() {
        return birth_Day;
    }

    public void setBirth_Day(String birth_Day) {
        this.birth_Day = birth_Day;
    }

    public String getPrivilege_Level() {
        return Privilege_Level;
    }

    public void setPrivilege_Level(String Privilege_Level) {
        this.Privilege_Level = Privilege_Level;
    }

    public String getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(String User_ID) {
        this.User_ID = User_ID;
    }
    
    
}
