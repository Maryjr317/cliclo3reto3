package co.usa.ciclo3MJR.ciclo3MJR.repository;


import co.usa.ciclo3MJR.ciclo3MJR.model.Mensaje;
import co.usa.ciclo3MJR.ciclo3MJR.repository.crud.MensajeCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//Componente que permite traer informacion y llevar informacion de y hacia una base de datos
@Repository

public class MensajeRepository {
    @Autowired
    //Instancia MensajeRepository
    private MensajeCrudRepository mensajeCrudRepository;

    //Se tienen los metodos que llaman los metodos particulares o acciones del mensajeCrudRepository

    public List<Mensaje> getAll(){
        return (List<Mensaje>) mensajeCrudRepository.findAll();
    }

    public Optional<Mensaje> getMensaje(int id){
        return mensajeCrudRepository.findById(id);
    }

    public Mensaje save(Mensaje m){
        return mensajeCrudRepository.save(m);
    }
}
