package co.usa.ciclo3MJR.ciclo3MJR.repository;

import co.usa.ciclo3MJR.ciclo3MJR.model.Reserva;
import co.usa.ciclo3MJR.ciclo3MJR.repository.crud.ReservaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//Componente que permite traer informacion y llevar informacion de y hacia una base de datos
@Repository

public class ReservaRepository {
    @Autowired
    //Instancia ReservaCrudRepository
    private ReservaCrudRepository reservaCrudRepository;

    //Se tienen los metodos que llaman los metodos particulares o acciones del reservaCrudRepository

    public List<Reserva> getAll(){
        return (List<Reserva>) reservaCrudRepository.findAll();
    }

    public Optional<Reserva> getReserva(int id){
        return reservaCrudRepository.findById(id);
    }

    public Reserva save(Reserva r){
        return reservaCrudRepository.save(r);
    }
}
