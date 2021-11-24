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

    //agrego la categoria en cinema
    @ManyToOne
    @JoinColumn(name = "idClient")
    //Se ignora el campo cinemas
    @JsonIgnoreProperties("cinemas") //como se llama en el archivo categoria
    private Categoria category;

    //union con la tabla mensaje
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "cinema")
    @JsonIgnoreProperties({"cinemas"})
    private List<Mensaje> messages;

    //relacion con la tabla reservacion
    @OneToMany(cascade={CascadeType.PERSIST},mappedBy = "cinema")
    @JsonIgnoreProperties({"cinemas","message"})
    private List<Reserva> reservations;

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

    public Categoria getCategory() {
        return category;
    }

    public void setCategory(Categoria category) {
        this.category = category;
    }

    public List<Mensaje> getMessages() {
        return messages;
    }

    public void setMessages(List<Mensaje> messages) {
        this.messages = messages;
    }

    public List<Reserva> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reserva> reservations) {
        this.reservations = reservations;
    }
}
