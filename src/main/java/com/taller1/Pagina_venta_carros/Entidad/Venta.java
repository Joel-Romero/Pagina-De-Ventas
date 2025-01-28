package com.taller1.Pagina_venta_carros.Entidad;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class Venta {
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Size(min=3, max=50)
    private String nombre;


    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    @Size(min=3, max=50)
    private String apellidos;


    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    @Size(min=10, max=10)
    private String cedula;

    public String getIngreso() {
        return ingreso;
    }
    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }
    private String ingreso;

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Size(min=10, max=10)
    private String telefono;

    public String getPago() {
        return pago;
    }
    public void setPago(String pago) {
        this.pago = pago;
    }
    @NotBlank
    private String pago;






}