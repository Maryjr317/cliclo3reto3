package co.usa.ciclo3MJR.ciclo3MJR.service;

import co.usa.ciclo3MJR.ciclo3MJR.model.Cinema;
import co.usa.ciclo3MJR.ciclo3MJR.model.Reserva;
import co.usa.ciclo3MJR.ciclo3MJR.repository.CinemaRepository;
import co.usa.ciclo3MJR.ciclo3MJR.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    //Este servicio (reservaRepository) se encarga de llamar los dos metodos definidos en reservaRepository
    public List<Reserva> getAll(){
        return reservaRepository.getAll();
    }

    public Optional<Reserva> getReserva (int id){
        return reservaRepository.getReserva(id);
    }
    //Estas son unas restricciones de logica del programa
    public Reserva save(Reserva r){
        if(r.getId()==null){
            return reservaRepository.save(r);
        }
        else{
            Optional<Reserva> reservaaux=reservaRepository.getReserva(r.getId());
            if(reservaaux.isEmpty()){
                return reservaRepository.save(r);
            }
            else{
                return r;
            }
        }
    }

}
