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
public class Reserve_Item {
    
     private String reserved_date;
     private String expired_date;

    public Reserve_Item() {
    }

    public Reserve_Item(String reserved_date, String expired_date) {
        this.reserved_date = reserved_date;
        this.expired_date = expired_date;
    }

    public String getReserved_date() {
        return reserved_date;
    }

    public void setReserved_date(String reserved_date) {
        this.reserved_date = reserved_date;
    }

    public String getExpired_date() {
        return expired_date;
    }

    public void setExpired_date(String expired_date) {
        this.expired_date = expired_date;
    }
    
    
}
