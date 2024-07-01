package Modelo;
// Generated 13-ene-2024 11:27:24 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Proveedor generated by hbm2java
 */
public class Proveedor  implements java.io.Serializable {


     private Integer codigo;
     private String nombre;
     private String tipo;
     private String telefono;
     private Set medicamentos = new HashSet(0);
     private Set pedidos = new HashSet(0);

    public Proveedor() {
    }

	
    public Proveedor(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    public Proveedor(String nombre, String tipo, String telefono, Set medicamentos, Set pedidos) {
       this.nombre = nombre;
       this.tipo = tipo;
       this.telefono = telefono;
       this.medicamentos = medicamentos;
       this.pedidos = pedidos;
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Set getMedicamentos() {
        return this.medicamentos;
    }
    
    public void setMedicamentos(Set medicamentos) {
        this.medicamentos = medicamentos;
    }
    public Set getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Set pedidos) {
        this.pedidos = pedidos;
    }




}

