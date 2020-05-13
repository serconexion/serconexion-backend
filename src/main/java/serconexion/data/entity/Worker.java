package serconexion.data.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.UUID;

public class Worker extends User{
    public Worker(UUID idUser, String name, String lastName, int identificationDocument,
                  String email, String password, boolean enabled, String role, Date createdAt,
                  Date updatedAt, double balance, int rating) {
        super(idUser, name, lastName, identificationDocument, email, password, enabled, role,
                createdAt, updatedAt);
        this.balance = balance;
        this.rating = 0;
        this.allRatings=new ArrayList<Float>();
    }

    private double balance;
    private int rating;
    private ArrayList<Float> allRatings;

    public boolean ratingVisibility(){
        for(Float a:allRatings){
 //               rating = rating+a;
        }
        return(allRatings.size()>4);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
