package serconexion.data.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.UUID;

public class Admin extends User{
    public Admin(UUID idUser, String name, String lastName, int identificationDocument, String email,
                 String password, boolean enabled, String role, Date createdAt, Date updatedAt) {
        super(idUser, name, lastName, identificationDocument, email, password, enabled, role,
                createdAt, updatedAt);
    }

    private ArrayList<Service> services = new ArrayList<Service>();

    public void createService(UUID idService, String name, String description){
        services.add(new Service(idService,name,description));
    }

}
