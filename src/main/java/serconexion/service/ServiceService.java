package serconexion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import serconexion.dao.ServiceDao;
import serconexion.model.User;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public abstract class ServiceService {
    private final ServiceDao serDao;

    @Autowired
    public ServiceService(@Qualifier("postgres") ServiceDao serDao) {
        this.serDao = serDao;
    }

    public int addService(serconexion.data.entity.Service service){
        return serDao.insertService(service);
    }

    public List<serconexion.data.entity.Service> getAllServices(){ return serDao.selectAllServices(); }

    public Optional<serconexion.data.entity.Service> getServiceById(UUID id){
        return serDao.selectServiceById(id);
    }

    public int deleteService(UUID id){
        return serDao.deleteServiceById(id);
    }

    public int updateService(UUID id, serconexion.data.entity.Service newUser){ return serDao.updateServiceById(id,newUser);    }

    public String oferenteService (serconexion.data.entity.Service service, User oferente) { return serDao.oferenteService(service,oferente.getIdUser());}
}
