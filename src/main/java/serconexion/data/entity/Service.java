package serconexion.data.entity;


import java.util.ArrayList;
import java.util.UUID;

public class Service {
    private UUID idService;
    private String name;
    private String description;
    private int value;
    public ArrayList<Service> services;

    public Service() {
    }

    public Service(UUID idService, String name, String description) {
        this.idService = idService;
        this.name = name;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public UUID getIdService() {
        return idService;
    }

    public void setIdService(UUID idService) {
        this.idService = idService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void ListService (Service service){
        services.add(service);
    }

}
