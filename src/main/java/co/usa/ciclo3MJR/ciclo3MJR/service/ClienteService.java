package co.usa.ciclo3MJR.ciclo3MJR.service;

import co.usa.ciclo3MJR.ciclo3MJR.model.Cliente;
import co.usa.ciclo3MJR.ciclo3MJR.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    //Este servicio (clienteRepository) se encarga de llamar los dos metodos definidos en clienteRepository

    public List<Cliente> getAll(){
        return clienteRepository.getAll();
    }

    public Optional<Cliente> getCliente (int id){
        return clienteRepository.getCliente(id);
    }
    //Estas son unas restricciones de logica del programa
    public Cliente save(Cliente c){
        if(c.getId()==null){
            return clienteRepository.save(c);
        }
        else{
            Optional<Cliente> clientaux=clienteRepository.getCliente(c.getId());
            if(clientaux.isEmpty()){
                return clienteRepository.save(c);
            }
            else{
                return c;
            }
        }
    }

}