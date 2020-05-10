package serconexion.data.entity;


import java.util.UUID;

public class Place {

    private UUID idAddrees;
    private String city;
    private String address;
    private UUID idUser;

    public Place() {
    }

    User u = new User();

    public UUID getIdAddrees() {
        return idAddrees;
    }

    public void setIdAddrees(UUID idAddrees) {
        this.idAddrees = idAddrees;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UUID getIdUser() {
        return u.getIdUser();
    }

    public void setIdUser(UUID idUser) {
        u.setIdUser(idUser);
        this.idUser = idUser;
    }
}
