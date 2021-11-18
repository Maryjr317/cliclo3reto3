package co.usa.ciclo3MJR.ciclo3MJR.repository;

import co.usa.ciclo3MJR.ciclo3MJR.model.Cinema;
import co.usa.ciclo3MJR.ciclo3MJR.repository.crud.CinemaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//Componente que permite traer informacion y llevar informacion de y hacia una base de datos
@Repository

public class CinemaRepository {
    @Autowired
    //Instancia CinemaCrudRepository
    private CinemaCrudRepository cinemaCrudRepository;

    //Se tienen los metodos que llaman los metodos particulares o acciones del cinemaCrudRepository

    public List<Cinema> getAll(){
        return (List<Cinema>) cinemaCrudRepository.findAll();
    }

    public Optional<Cinema> getCinema(int id){
        return cinemaCrudRepository.findById(id);
    }

    public Cinema save(Cinema p){
        return cinemaCrudRepository.save(p);
    }
}
