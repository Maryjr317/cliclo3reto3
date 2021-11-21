package co.usa.ciclo3MJR.ciclo3MJR.repository.crud;


import co.usa.ciclo3MJR.ciclo3MJR.model.Cliente;
import org.springframework.data.repository.CrudRepository;
//Se crea una interfaz que herada de CrudRepository, indica a que clase de entidad (Cliente) y el tipo de dato (integer)

public interface ClienteCrudRepository  extends CrudRepository<Cliente,Integer> {
}
