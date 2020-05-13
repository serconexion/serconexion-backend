package serconexion.data.entity;


import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;



public class User {

    private UUID idUser;
    private String name;
    private String lastName;
    private int identificationDocument;
    private String email;
    private String password;
    private boolean enabled;
    private String role;
    private double balance;
    private int rating;
    private Date createdAt;
    private Date updatedAt;

    public User() {
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



}

