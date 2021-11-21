package co.usa.ciclo3MJR.ciclo3MJR.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "mensaje")

//Se crea el paquete de model donde esta creado el mensaje
public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String messageText;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy ="mensaje")
    @JsonIgnoreProperties("mensaje")
    private List<Cinema> cinemasm;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy ="mensaje")
    @JsonIgnoreProperties("mensaje")
    private List<Cinema> cinemasmc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public List<Cinema> getCinemasm() {
        return cinemasm;
    }

    public void setCinemasm(List<Cinema> cinemasm) {
        this.cinemasm = cinemasm;
    }

    public List<Cinema> getCinemasmc() {
        return cinemasmc;
    }

    public void setCinemasmc(List<Cinema> cinemasmc) {
        this.cinemasmc = cinemasmc;
    }
}
