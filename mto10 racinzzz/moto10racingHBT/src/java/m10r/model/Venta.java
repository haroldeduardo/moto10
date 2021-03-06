package m10r.model;
// Generated Jul 1, 2018 11:19:14 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Venta generated by hbm2java
 */
public class Venta  implements java.io.Serializable {


     private Integer idVenta;
     private String numeroVenta;
     private int idEmpleado;
     private int idPersona;
     private float totalVenta;
     private Float totalDescuentoVenta;
     private int idTipoTransaccion;
     private Date fechaVenta;

    public Venta() {
    }

	
    public Venta(String numeroVenta, int idEmpleado, int idPersona, float totalVenta, int idTipoTransaccion, Date fechaVenta) {
        this.numeroVenta = numeroVenta;
        this.idEmpleado = idEmpleado;
        this.idPersona = idPersona;
        this.totalVenta = totalVenta;
        this.idTipoTransaccion = idTipoTransaccion;
        this.fechaVenta = fechaVenta;
    }
    public Venta(String numeroVenta, int idEmpleado, int idPersona, float totalVenta, Float totalDescuentoVenta, int idTipoTransaccion, Date fechaVenta) {
       this.numeroVenta = numeroVenta;
       this.idEmpleado = idEmpleado;
       this.idPersona = idPersona;
       this.totalVenta = totalVenta;
       this.totalDescuentoVenta = totalDescuentoVenta;
       this.idTipoTransaccion = idTipoTransaccion;
       this.fechaVenta = fechaVenta;
    }
   
    public Integer getIdVenta() {
        return this.idVenta;
    }
    
    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }
    public String getNumeroVenta() {
        return this.numeroVenta;
    }
    
    public void setNumeroVenta(String numeroVenta) {
        this.numeroVenta = numeroVenta;
    }
    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public int getIdPersona() {
        return this.idPersona;
    }
    
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    public float getTotalVenta() {
        return this.totalVenta;
    }
    
    public void setTotalVenta(float totalVenta) {
        this.totalVenta = totalVenta;
    }
    public Float getTotalDescuentoVenta() {
        return this.totalDescuentoVenta;
    }
    
    public void setTotalDescuentoVenta(Float totalDescuentoVenta) {
        this.totalDescuentoVenta = totalDescuentoVenta;
    }
    public int getIdTipoTransaccion() {
        return this.idTipoTransaccion;
    }
    
    public void setIdTipoTransaccion(int idTipoTransaccion) {
        this.idTipoTransaccion = idTipoTransaccion;
    }
    public Date getFechaVenta() {
        return this.fechaVenta;
    }
    
    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }




}


