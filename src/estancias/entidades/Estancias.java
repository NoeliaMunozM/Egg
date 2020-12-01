
package estancias.entidades;

import java.util.Date;

public class Estancias {
  private int id;
  private String nombre_huesped;
  private Date fecha_desde;
  private Date fecha_hasta;
  private Clientes cliente;
  private Casas casa;

    public Estancias(int id, String nombre_huesped, Date fecha_desde, Date fecha_hasta, Clientes cliente, Casas casa) {
        this.id = id;
        this.nombre_huesped = nombre_huesped;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.cliente = cliente;
        this.casa = casa;
    }

    public Estancias() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_huesped() {
        return nombre_huesped;
    }

    public void setNombre_huesped(String nombre_huesped) {
        this.nombre_huesped = nombre_huesped;
    }

    public Date getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(Date fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public Date getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(Date fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Casas getCasa() {
        return casa;
    }

    public void setCasa(Casas casa) {
        this.casa = casa;
    }
  
  
}
