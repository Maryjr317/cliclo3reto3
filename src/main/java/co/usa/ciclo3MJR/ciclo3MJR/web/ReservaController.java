package co.usa.ciclo3MJR.ciclo3MJR.web;

import co.usa.ciclo3MJR.ciclo3MJR.model.Reserva;
import co.usa.ciclo3MJR.ciclo3MJR.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//Determina almenos la primera parte de la url total
@RequestMapping("/api/Reservation")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class ReservaController {
    @Autowired
    private ReservaService reservaService;

    //Metodo get para obtener todos los elementos con su url
    @GetMapping("/all")
    public List<Reserva> getReserva(){
        return reservaService.getAll();
    }

    //Metodo get para obtener solo los datos de un id
    @GetMapping("/{id}")
    public Optional<Reserva> getReserva(@PathVariable ("id") int id){
        return reservaService.getReserva(id);
    }

    //Metodo post se pone Status.CREATED para dar un 201 y guarda los datos
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reserva save(@RequestBody Reserva r){
        return reservaService.save(r);
    }
}
