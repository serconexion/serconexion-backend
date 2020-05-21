package serconexion.control;

import serconexion.data.entity.Service;
import java.util.ArrayList;
import java.util.UUID;

public class Admin  {

    private ArrayList<Service> services = new ArrayList<Service>();

    public void createService(UUID idService, String name, String description){
        services.add(new Service(idService,name,description));
    }


}
