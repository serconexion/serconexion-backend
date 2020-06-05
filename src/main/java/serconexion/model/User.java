package serconexion.model;


import com.fasterxml.jackson.annotation.JsonProperty;
//import com.sun.istack.internal.NotNull;
import serconexion.data.entity.CreditCard;
import serconexion.data.entity.Place;

import java.sql.Date;
import java.time.LocalDate;
import java.util.*;



public class User {

    private UUID idUser;
    //@NotNull
    private String name;
    //@NotNull
    private String lastName;
    //@NotNull
    private int identificationDocument;
    //@NotNull
    private String email;
    private String password;
    private boolean enabled;
    private String role;
    private double balance;
    private double rating;
    private ArrayList<Double> allRatings;
    private ArrayList<CreditCard> creditCards;
    private ArrayList<Place> ListPlaces;
    private Date createdAt;
    private Date updatedAt;

    public User(){

    }
    public User(@JsonProperty("id") UUID idUser,@JsonProperty("name") String name,
                @JsonProperty("lastName")String lastName,
                @JsonProperty("identification") int identificationDocument,
                @JsonProperty("email")String email,
                @JsonProperty("password")String password) {
        this.idUser = idUser;
        this.name = name;
        this.lastName = lastName;
        this.identificationDocument = identificationDocument;
        this.email = email;
        this.password = password;
    }

    public User(UUID idUser, String from_postgres_db, String from_postgres_db1, String from_postgres_db2, String from_postgres_db3, String from_postgres_db4) {
    }

    public UUID getIdUser() {
        return idUser;
    }


    public void setIdUser(UUID idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdentificationDocument() {
        return identificationDocument;
    }

    public void setIdentificationDocument(int identificationDocument) {
        this.identificationDocument = identificationDocument;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ArrayList<Place> getListPlaces() {
        return ListPlaces;
    }

    public void setListPlaces(ArrayList<Place> listPlaces) {
        ListPlaces = listPlaces;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    public ArrayList<Double> getAllRatings() {
        return allRatings;
    }

    public void setAllRatings(ArrayList<Double> allRatings) {
        this.allRatings = allRatings;
    }

    public ArrayList<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(ArrayList<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void chooseRole (String rol){
        User user = new User();
        user.setRole(rol);
    }

    public void recordUser (UUID idUser, String name, String lastName, int identificationDocument, String email, String password) {

        User user = new User();
        LocalDate fecha = LocalDate.now();

        user.setIdUser(idUser);
        user.setName(name);
        user.setLastName(lastName);
        user.setIdentificationDocument(identificationDocument);
        user.setEmail(email);
        user.setPassword(password);
        user.setEnabled(true);
        user.setCreatedAt(Date.valueOf(fecha));

        String role =user.getRole();

        if(role.equals("Oferente")){
            user.setBalance(0);
            user.setRating(0);
        }

    }

    public void EditUser (UUID idUser, String name, String lastName, int identificationDocument, String email, String password) {

        User user = new User();
        LocalDate fecha = LocalDate.now();

        user.setIdUser(idUser);
        user.setName(name);
        user.setLastName(lastName);
        user.setIdentificationDocument(identificationDocument);
        user.setEmail(email);
        user.setPassword(password);
        user.setEnabled(true);
        user.setCreatedAt(Date.valueOf(fecha));

        String role =user.getRole();


    }


    public boolean ratingVisibility(){
        for(double a:allRatings){
            rating = rating+a;
        }
            rating=rating/allRatings.size();
        return(allRatings.size()>4);
    }

    public void addRating(double rate){
        allRatings.add(rate);
        ratingVisibility();
    }

    public void ToListPlace (Place newPlace){
        User user = new User();
        ArrayList<Place> list = new ArrayList<Place>();
        if(user.getListPlaces() == null) {
            list.add(newPlace);
            user.setListPlaces(list);
        } else {
            ArrayList<Place> oldPlace = user.getListPlaces();
            for ( Place p: oldPlace ){
                list.add(p);
            }
            list.add(newPlace);
            user.setListPlaces(list);
        }

    }

}

