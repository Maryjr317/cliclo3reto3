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

    public List<Cinema> getCinemasr() {
        return cinemasr;
    }

    public void setCinemasr(List<Cinema> cinemasr) {
        this.cinemasr = cinemasr;
    }

    public List<Cinema> getCinemasrc() {
        return cinemasrc;
    }

    public void setCinemasrc(List<Cinema> cinemasrc) {
        this.cinemasrc = cinemasrc;
    }
}
