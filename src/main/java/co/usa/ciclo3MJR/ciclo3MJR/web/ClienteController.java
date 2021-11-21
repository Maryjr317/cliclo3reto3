package co.usa.ciclo3MJR.ciclo3MJR.web;

import co.usa.ciclo3MJR.ciclo3MJR.model.Cliente;
import co.usa.ciclo3MJR.ciclo3MJR.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//Determina almenos la primera parte de la url total
@RequestMapping("/api/Client")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    //Metodo get para obtener todos los elementos con su url
    @GetMapping("/all")
    public List<Cliente> getClientes(){
        return clienteService.getAll();
    }

    //Metodo get para obtener solo los datos de un id
    @GetMapping("/{id}")
    public Optional<Cliente> getCliente(@PathVariable ("id") int id){
        return clienteService.getCliente(id);
    }

    //Metodo post se pone Status.CREATED para dar un 201 y guarda los datos
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente save(@RequestBody Cliente c){
        return clienteService.save(c);
    }
}
