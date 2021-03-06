package m10r.model;
// Generated Jul 1, 2018 11:19:14 PM by Hibernate Tools 4.3.1



/**
 * DetalleVenta generated by hbm2java
 */
public class DetalleVenta  implements java.io.Serializable {


     private Integer idDetalleVenta;
     private int idVenta;
     private int idProducto;
     private String codigoProducto;
     private String nombreProducto;
     private float valorVentaProducto;
     private String iva;
     private int unidadesVendidas;
     private float totalDetalleVenta;

    public DetalleVenta() {
    }

    public DetalleVenta(int idVenta, int idProducto, String codigoProducto, String nombreProducto, float valorVentaProducto, String iva, int unidadesVendidas, float totalDetalleVenta) {
       this.idVenta = idVenta;
       this.idProducto = idProducto;
       this.codigoProducto = codigoProducto;
       this.nombreProducto = nombreProducto;
       this.valorVentaProducto = valorVentaProducto;
       this.iva = iva;
       this.unidadesVendidas = unidadesVendidas;
       this.totalDetalleVenta = totalDetalleVenta;
    }
   
    public Integer getIdDetalleVenta() {
        return this.idDetalleVenta;
    }
    
    public void setIdDetalleVenta(Integer idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }
    public int getIdVenta() {
        return this.idVenta;
    }
    
    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public String getCodigoProducto() {
        return this.codigoProducto;
    }
    
    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    public String getNombreProducto() {
        return this.nombreProducto;
    }
    
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public float getValorVentaProducto() {
        return this.valorVentaProducto;
    }
    
    public void setValorVentaProducto(float valorVentaProducto) {
        this.valorVentaProducto = valorVentaProducto;
    }
    public String getIva() {
        return this.iva;
    }
    
    public void setIva(String iva) {
        this.iva = iva;
    }
    public int getUnidadesVendidas() {
        return this.unidadesVendidas;
    }
    
    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }
    public float getTotalDetalleVenta() {
        return this.totalDetalleVenta;
    }
    
    public void setTotalDetalleVenta(float totalDetalleVenta) {
        this.totalDetalleVenta = totalDetalleVenta;
    }




}


