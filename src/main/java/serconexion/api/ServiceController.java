package serconexion.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import serconexion.data.entity.Service;
import serconexion.model.User;
import serconexion.service.ServiceService;

import java.util.List;
import java.util.UUID;

public abstract class ServiceController {
    private final ServiceService serService;

    @Autowired
    public ServiceController(ServiceService serService) {
        this.serService = serService;
    }

    @PostMapping
    public void addService( @RequestBody Service ser){ serService.addService(ser);  }

    @GetMapping
    public List<Service> getAllServices(){
        return serService.getAllServices();
    }

    @GetMapping(path = "{idService}")
    public Service getServiceById(@PathVariable("idService") UUID id){
        return serService.getServiceById(id).orElse(null);
    }

    @DeleteMapping(path = "{idService}")
    public void deleteServiceById(@PathVariable("idService") UUID id){
        serService.deleteService(id);
    }
    @PutMapping(path = "{idService}")

    public void updateJob(@PathVariable("idService") UUID id, @RequestBody Service serToUpdate){
        serService.updateService(id,serToUpdate);
    }

    @PostMapping
    public String oferenteService (@RequestBody Service service, User oferente) {
        return serService.oferenteService(service,oferente);
    }

}
