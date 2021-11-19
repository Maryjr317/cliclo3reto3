package co.usa.ciclo3MJR.ciclo3MJR.repository.crud;

import co.usa.ciclo3MJR.ciclo3MJR.model.Categoria;
import org.springframework.data.repository.CrudRepository;

//Se crea una interfaz que herada de CrudRepository, indica a que clase de entidad (Categoria) y el tipo de dato (integer)
public interface CategoriaCrudRepository extends CrudRepository<Categoria,Integer> {
}
