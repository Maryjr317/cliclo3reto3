package co.usa.ciclo3MJR.ciclo3MJR.repository;

import co.usa.ciclo3MJR.ciclo3MJR.model.Categoria;
import co.usa.ciclo3MJR.ciclo3MJR.repository.crud.CategoriaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//Componente que permite traer informacion y llevar informacion de y hacia una base de datos
@Repository
public class CategoriaRepository {

    @Autowired
    //Instancia CategoriaCrudRepository
    private CategoriaCrudRepository categoriaCrudRepository;

    //Se tienen los metodos que llaman los metodos particulares o acciones del categoriaCrudRepository

    public List<Categoria> getAll(){
        return (List<Categoria>) categoriaCrudRepository.findAll();
    }

    public Optional<Categoria> getCategoria(int id){
        return categoriaCrudRepository.findById(id);
    }

    public Categoria save(Categoria c){
        return categoriaCrudRepository.save(c);
    }
}
