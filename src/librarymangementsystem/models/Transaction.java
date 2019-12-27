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
public class Transaction {
    
    private String issued_date;
    private String due_date;
    private String  returned_date;
    private double  fines;
    private int t_id;
    private int i_id;
    private int u_id;
    private int b_id;

  

    public Transaction() {
    }

    public Transaction(String issued_date, String due_date, String returned_date, double fines,int t_id, int i_id, int u_id,int b_id) {
        this.issued_date = issued_date;
        this.due_date = due_date;
        this.returned_date = returned_date;
        this.fines = fines;
        this.t_id = t_id;
        this.i_id = i_id;
        this.u_id = u_id;
        this.b_id = b_id;
    
    }

    public String getIssued_date() {
        return issued_date;
    }

    public void setIssued_date(String issued_date) {
        this.issued_date = issued_date;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public String getReturned_date() {
        return returned_date;
    }

    public void setReturned_date(String returned_date) {
        this.returned_date = returned_date;
    }

    public double getFines() {
        return fines;
    }

    public void setFines(double fines) {
        this.fines = fines;
    }
    
    public int getT_id() {
        return t_id;
    }

  
    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public int getI_id() {
        return i_id;
    }

    public void setI_id(int i_id) {
        this.i_id = i_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }
     public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }
    
}
