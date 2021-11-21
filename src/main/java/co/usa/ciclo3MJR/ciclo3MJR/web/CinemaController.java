package co.usa.ciclo3MJR.ciclo3MJR.web;

import co.usa.ciclo3MJR.ciclo3MJR.model.Cinema;
import co.usa.ciclo3MJR.ciclo3MJR.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//Determina almenos la primera parte de la url total
@RequestMapping("/api/Cinema")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class CinemaController {

    @Autowired
    private CinemaService cinemaService;

    //Metodo get para obtener todos los elementos con su url
    @GetMapping("/all")
    public List<Cinema> getCinemas(){
        return cinemaService.getAll();
    }

    //Metodo get para obtener solo los datos de un id
    @GetMapping("/{id}")
    public Optional<Cinema> getCinema(@PathVariable ("id") int id){
        return cinemaService.getCinema(id);
    }

    //Metodo post se pone Status.CREATED para dar un 201 y guarda los datos
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cinema save(@RequestBody Cinema p){
        return cinemaService.save(p);
    }
}
