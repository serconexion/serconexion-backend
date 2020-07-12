package serconexion.dao;

import serconexion.data.entity.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ServiceDao {
    int insertService(UUID id, Service job);

    default int insertService(Service job){
        UUID id = UUID.randomUUID();
        return insertService(id,job);
    }

    List<Service> selectAllServices();

    Optional<Service> selectServiceById(UUID id);

    int deleteServiceById(UUID id);

    int updateServiceById(UUID id, Service service);

    String oferenteService(Service service, UUID oferente);
}
