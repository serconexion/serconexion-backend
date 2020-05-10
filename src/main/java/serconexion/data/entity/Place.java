package serconexion.data.entity;


import java.util.UUID;

public class Place extends User{

    private UUID idAddrees;
    private String city;
    private String address;

    public Place() {
    }

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

    @Override
    public UUID getIdUser() {
        return super.getIdUser();
    }

    @Override
    public void setIdUser(UUID idUser) {
        super.setIdUser(idUser);
    }
}
