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


}
