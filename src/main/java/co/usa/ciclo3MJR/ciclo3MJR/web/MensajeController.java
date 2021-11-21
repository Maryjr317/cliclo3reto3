package co.usa.ciclo3MJR.ciclo3MJR.web;

import co.usa.ciclo3MJR.ciclo3MJR.model.Mensaje;
import co.usa.ciclo3MJR.ciclo3MJR.service.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//Determina almenos la primera parte de la url total
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class MensajeController {
    @Autowired
    private MensajeService mensajeService;

    //Metodo get para obtener todos los elementos con su url
    @GetMapping("/all")
    public List<Mensaje> getMensaje(){
        return mensajeService.getAll();
    }

    //Metodo get para obtener solo los datos de un id
    @GetMapping("/{id}")
    public Optional<Mensaje> getMensaje(@PathVariable ("id") int id){
        return mensajeService.getMensaje(id);
    }

    //Metodo post se pone Status.CREATED para dar un 201 y guarda los datos
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Mensaje save(@RequestBody Mensaje m){
        return mensajeService.save(m);
    }
}
