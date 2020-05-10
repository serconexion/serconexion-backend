package serconexion.data.entity;


import java.util.Date;
import java.util.UUID;

public class CreditCard extends User{

    private UUID idCard;
    private int number;
    private Date expitationDate;
    private String address;
    private String titular;

    public CreditCard() {
    }

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

    public Date getExpitationDate() {
        return expitationDate;
    }

    public void setExpitationDate(Date expitationDate) {
        this.expitationDate = expitationDate;
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

    @Override
    public UUID getIdUser() {
        return super.getIdUser();
    }

    @Override
    public void setIdUser(UUID idUser) {
        super.setIdUser(idUser);
    }
}
