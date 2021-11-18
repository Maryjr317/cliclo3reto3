package co.usa.ciclo3MJR.ciclo3MJR.service;

import co.usa.ciclo3MJR.ciclo3MJR.model.Cinema;
import co.usa.ciclo3MJR.ciclo3MJR.repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CinemaService {

    @Autowired
    private CinemaRepository cinemaRepository;

    //Este servicio (cinemaRepository) se encarga de llamar los dos metodos definidos en cinemaRepository
    public List<Cinema> getAll(){
        return cinemaRepository.getAll();
    }

    public Optional<Cinema> getCinema (int id){
        return cinemaRepository.getCinema(id);
    }
    //Estas son unas restricciones de logica del programa
    public Cinema save(Cinema p){
        if(p.getId()==null){
            return cinemaRepository.save(p);
        }
        else{
            Optional<Cinema> cinemaux=cinemaRepository.getCinema(p.getId());
            if(cinemaux.isEmpty()){
                return cinemaRepository.save(p);
            }
            else{
                return p;
            }
        }
    }

}
