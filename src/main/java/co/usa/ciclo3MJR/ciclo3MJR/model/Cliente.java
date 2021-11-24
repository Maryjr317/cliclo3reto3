package co.usa.ciclo3MJR.ciclo3MJR.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "cliente")

//Se crea el paquete de model donde esta creado el cliente
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;
    private String email;
    private String password;
    private String name;
    private Integer age;

    //mensajes
    @OneToMany(cascade ={CascadeType.PERSIST},mappedBy="client")
    @JsonIgnoreProperties("client")
    public List<Mensaje> messages;

    //Reservas
    @OneToMany(cascade ={CascadeType.PERSIST},mappedBy="client")
    @JsonIgnoreProperties("client")
    public List<Reserva> reservations;

    private String score ;

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
