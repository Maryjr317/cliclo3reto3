package co.usa.ciclo3MJR.ciclo3MJR.service;

import co.usa.ciclo3MJR.ciclo3MJR.model.Categoria;
import co.usa.ciclo3MJR.ciclo3MJR.model.Cinema;
import co.usa.ciclo3MJR.ciclo3MJR.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    //Este servicio (categoriaRepository) se encarga de llamar los dos metodos definidos en categoriaRepository

    public List<Categoria> getAll(){
        return categoriaRepository.getAll();
    }

    public Optional<Categoria> getCategoria(int id){
        return categoriaRepository.getCategoria(id);
    }

    public Categoria save(Categoria c){
        if(c.getId()==null){
            return categoriaRepository.save(c);
        }
        else{
            Optional<Categoria> categoriaaux=categoriaRepository.getCategoria(c.getId());
            if(categoriaaux.isEmpty()){
                return categoriaRepository.save(c);
            }
            else{
                return c;
            }
        }
    }
}
