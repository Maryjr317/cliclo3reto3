package co.usa.ciclo3MJR.ciclo3MJR.repository.crud;

import co.usa.ciclo3MJR.ciclo3MJR.model.Mensaje;
import org.springframework.data.repository.CrudRepository;

//Se crea una interfaz que herada de CrudRepository, indica a que clase de entidad (Mensaje) y el tipo de dato (integer)
public interface MensajeCrudRepository extends CrudRepository<Mensaje,Integer> {
}
