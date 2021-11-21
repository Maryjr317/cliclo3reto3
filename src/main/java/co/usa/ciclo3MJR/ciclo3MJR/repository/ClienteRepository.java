package co.usa.ciclo3MJR.ciclo3MJR.repository;

import co.usa.ciclo3MJR.ciclo3MJR.model.Cliente;
import co.usa.ciclo3MJR.ciclo3MJR.repository.crud.ClienteCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//Componente que permite traer informacion y llevar informacion de y hacia una base de datos
@Repository

public class ClienteRepository {
    @Autowired
    //Instancia ClienteCrudRepository
    private ClienteCrudRepository clienteCrudRepository;

    //Se tienen los metodos que llaman los metodos particulares o acciones del cinemaCrudRepository

    public List<Cliente> getAll(){
        return (List<Cliente>) clienteCrudRepository.findAll();
    }

    public Optional<Cliente> getCliente(int id){
        return clienteCrudRepository.findById(id);
    }

    public Cliente save(Cliente c){
        return clienteCrudRepository.save(c);
    }
}


