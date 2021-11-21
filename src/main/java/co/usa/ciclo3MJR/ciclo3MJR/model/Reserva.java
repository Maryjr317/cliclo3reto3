package co.usa.ciclo3MJR.ciclo3MJR.model;

import ch.qos.logback.core.net.server.Client;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "reserva")

//Se crea el paquete de model donde esta creado el reserva
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date startDate;
    private Date devolutionDate;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy ="reserva")
    @JsonIgnoreProperties("reserva")
    private List<Cinema> cinemasr;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy ="reserva")
    @JsonIgnoreProperties("reserva")
    private List<Cinema> cinemasrc;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
