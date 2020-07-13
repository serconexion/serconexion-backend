package serconexion.data.entity;


import serconexion.model.User;

import java.sql.Date;
import java.sql.Time;
import java.util.UUID;

public class Job  {
    private UUID idJob;
    private String descripcion;
    private Time time;
    private double value;
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

    public Job(UUID idCliente, UUID idOferente, UUID idServicio, String des) {
        idService= idServicio;
        idClient=idCliente;
        idService=idServicio;
        descripcion =des;
        idWorker=idOferente;

    }

    public UUID getIdJob() {
        return idJob;
    }

    public void setIdJob(UUID idJob) {
        this.idJob = idJob;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public java.sql.Time getTime() {
        return time;
    }

    public void setTime(java.sql.Time time) {
        this.time = time;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
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
        return location.getIdAddress();
    }

    public void setIdLocation(UUID idLocation) {
        location.setIdAddress(idLocation);
        this.idLocation = idLocation;
    }
    public int EstimateValue (int hour){
        int value = 0;
        Service service = new Service();
        value = service.getValue()*hour;
        return value;
    }

    public double Percentage (int hour){
        double value = EstimateValue(hour);
        value = value*0.05;
        return  value;
    }
}
