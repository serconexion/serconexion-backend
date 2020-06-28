package serconexion.data.entity;

//revisar
import serconexion.model.User;

import java.util.Date;
import java.util.UUID;

public class CreditCard {

    private UUID idCard;
    private int number;
    private Date expirationDate;
    private String address;
    private String titular;
    private UUID idUser;

    public CreditCard() {
    }

    User u = new User();

    public UUID getIdCard() {
        return idCard;
    }

    public void setIdCard(UUID idCard) {
        this.idCard = idCard;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public UUID getIdUser() {
        return u.getIdUser();
    }

    public void setIdUser(UUID idUser) {
        u.setIdUser(idUser);
        this.idUser = idUser;
    }

    public int EstimateValue (int hour){
        int value = 0;
        Service service = new Service();
        value = service.getValue()*hour;
        return value;
    }

    public double Percentage (int hour){
        double value = EstimateValue(hour);
        value = value*0.05;
        return  value;
    }
    
}
