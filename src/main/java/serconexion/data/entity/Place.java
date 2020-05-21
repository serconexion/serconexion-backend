package serconexion.data.entity;


import java.util.UUID;

public class Place {

    private UUID idAddress;
    private String city;
    private String address;
    private UUID idUser;

    public Place() {
    }

    User u = new User();

    public UUID getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(UUID idAddress) {
        this.idAddress = idAddress;
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
