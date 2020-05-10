package serconexion.data.entity;


import java.util.UUID;

public class Account  {

    private UUID idAccount;
    private int number;
    private String accountType;
    private String bank;
    private String titular;
    private UUID idUser;
    User u = new User();

    public Account() {
    }

    public UUID getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(UUID idAccount) {
        this.idAccount = idAccount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
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
}
