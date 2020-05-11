package serconexion.data.entity;


import java.sql.Date;
import java.sql.Time;
import java.util.UUID;

public class Job  {
    private UUID IdJOb;
    private String Descripcion;
    private Time Time;
    private double Value;
    private int status;
    private double rating;
    private Date createdAt;
    private Date updatedAt;
    private boolean enabled;
    private UUID idService;
    private UUID idClient;
    private UUID idWorker;
    private UUID idLocation;

    public Job() {
    }

    Service service = new Service();
    User client = new User();
    User worker = new User();
    Place location = new Place();

    public UUID getIdJOb() {
        return IdJOb;
    }

    public void setIdJOb(UUID idJOb) {
        IdJOb = idJOb;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public java.sql.Time getTime() {
        return Time;
    }

    public void setTime(java.sql.Time time) {
        Time = time;
    }

    public double getValue() {
        return Value;
    }

    public void setValue(double value) {
        Value = value;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public UUID getIdService() {
        return service.getIdService();
    }

    public void setIdService(UUID idService) {
        service.setIdService(idService);
        this.idService = idService;
    }

    public UUID getIdClient() {
        return client.getIdUser();
    }

    public void setIdClient(UUID idClient) {
        client.setIdUser(idClient);
        this.idClient = idClient;
    }

    public UUID getIdWorker() {
        return worker.getIdUser();
    }

    public void setIdWorker(UUID idWorker) {
        worker.setIdUser(idWorker);
        this.idWorker = idWorker;
    }

    public UUID getIdLocation() {
        return location.getIdAddrees();
    }

    public void setIdLocation(UUID idLocation) {
        location.setIdAddrees(idLocation);
        this.idLocation = idLocation;
    }
}
