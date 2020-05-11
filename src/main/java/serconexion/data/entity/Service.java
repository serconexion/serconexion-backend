package serconexion.data.entity;


import java.util.UUID;

public class Service {
    private UUID idService;
    private String name;
    private String description;

    public Service() {
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
        name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        description = description;
    }
}
