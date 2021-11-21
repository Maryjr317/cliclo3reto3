package co.usa.ciclo3MJR.ciclo3MJR.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "cinema")

//Se crea el paquete de model donde esta creado el cinema
public class Cinema implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String owner;
    private String name;
    private Integer capacity;
    private String description;
    private Integer category;

    //agrego la categoria en cinema
    @ManyToOne
    @JoinColumn(name = "categoriaId")
    //Se ignora el campo cinemas
    @JsonIgnoreProperties("cinemas") //como se llama en el archivo categoria
    private Categoria categoria;

    //mensajes
    @ManyToOne
    @JoinColumn(name = "mensajesid")
    //Se ignora el campo cinemas
    @JsonIgnoreProperties("cinemasm") //como se llama en el archivo mensaje
    private Mensaje mensaje;

    //reservaciones
    @ManyToOne
    @JoinColumn(name = "reservacionesid")
    //Se ignora el campo cinemas
    @JsonIgnoreProperties("cinemasr") //como se llama en el archivo
    private Reserva reserva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Mensaje getMensaje() {
        return mensaje;
    }

    public void setMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
