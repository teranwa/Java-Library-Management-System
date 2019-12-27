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
public class Item {
    
    
    private String title;
    private String author;
    private int publisher_ID;
    private String type;
    private int item_ID;
    private double price;
    private String category;
    private String added_Date;

    public Item() {
    }

    public Item(String title, String author, int publisher_ID, String type, int item_ID, double price, String category, String added_Date) {
        this.title = title;
        this.author = author;
        this.publisher_ID = publisher_ID;
        this.type = type;
        this.item_ID = item_ID;
        this.price = price;
        this.category = category;
        this.added_Date = added_Date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublisher_ID() {
        return publisher_ID;
    }

    public void setPublisher_ID(int publisher_ID) {
        this.publisher_ID = publisher_ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getItem_ID() {
        return item_ID;
    }

    public void setItem_ID(int item_ID) {
        this.item_ID = item_ID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAdded_Date() {
        return added_Date;
    }

    public void setAdded_Date(String added_Date) {
        this.added_Date = added_Date;
    }

    
}
