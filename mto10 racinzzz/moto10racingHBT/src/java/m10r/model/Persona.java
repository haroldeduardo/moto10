package m10r.model;
// Generated Jul 1, 2018 11:19:14 PM by Hibernate Tools 4.3.1



/**
 * Persona generated by hbm2java
 */
public class Persona  implements java.io.Serializable {


     private Integer idPersona;
     private int idTipoPersona;
     private int idTipoDocumento;
     private int identificacionPersona;
     private String nombresPersona;
     private String apellidosPersona;
     private int idDepartamento;
     private int idCiudad;
     private String direccionPersona;
     private String telefonoPersona;
     private String correoPersona;

    public Persona() {
    }

	
    public Persona(int idTipoPersona, int idTipoDocumento, int identificacionPersona, String nombresPersona, String apellidosPersona, int idDepartamento, int idCiudad) {
        this.idTipoPersona = idTipoPersona;
        this.idTipoDocumento = idTipoDocumento;
        this.identificacionPersona = identificacionPersona;
        this.nombresPersona = nombresPersona;
        this.apellidosPersona = apellidosPersona;
        this.idDepartamento = idDepartamento;
        this.idCiudad = idCiudad;
    }
    public Persona(int idTipoPersona, int idTipoDocumento, int identificacionPersona, String nombresPersona, String apellidosPersona, int idDepartamento, int idCiudad, String direccionPersona, String telefonoPersona, String correoPersona) {
       this.idTipoPersona = idTipoPersona;
       this.idTipoDocumento = idTipoDocumento;
       this.identificacionPersona = identificacionPersona;
       this.nombresPersona = nombresPersona;
       this.apellidosPersona = apellidosPersona;
       this.idDepartamento = idDepartamento;
       this.idCiudad = idCiudad;
       this.direccionPersona = direccionPersona;
       this.telefonoPersona = telefonoPersona;
       this.correoPersona = correoPersona;
    }
   
    public Integer getIdPersona() {
        return this.idPersona;
    }
    
    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }
    public int getIdTipoPersona() {
        return this.idTipoPersona;
    }
    
    public void setIdTipoPersona(int idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }
    public int getIdTipoDocumento() {
        return this.idTipoDocumento;
    }
    
    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }
    public int getIdentificacionPersona() {
        return this.identificacionPersona;
    }
    
    public void setIdentificacionPersona(int identificacionPersona) {
        this.identificacionPersona = identificacionPersona;
    }
    public String getNombresPersona() {
        return this.nombresPersona;
    }
    
    public void setNombresPersona(String nombresPersona) {
        this.nombresPersona = nombresPersona;
    }
    public String getApellidosPersona() {
        return this.apellidosPersona;
    }
    
    public void setApellidosPersona(String apellidosPersona) {
        this.apellidosPersona = apellidosPersona;
    }
    public int getIdDepartamento() {
        return this.idDepartamento;
    }
    
    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
    public int getIdCiudad() {
        return this.idCiudad;
    }
    
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }
    public String getDireccionPersona() {
        return this.direccionPersona;
    }
    
    public void setDireccionPersona(String direccionPersona) {
        this.direccionPersona = direccionPersona;
    }
    public String getTelefonoPersona() {
        return this.telefonoPersona;
    }
    
    public void setTelefonoPersona(String telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }
    public String getCorreoPersona() {
        return this.correoPersona;
    }
    
    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }




}


