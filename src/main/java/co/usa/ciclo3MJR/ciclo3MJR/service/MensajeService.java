package co.usa.ciclo3MJR.ciclo3MJR.service;

import co.usa.ciclo3MJR.ciclo3MJR.model.Cinema;
import co.usa.ciclo3MJR.ciclo3MJR.model.Mensaje;
import co.usa.ciclo3MJR.ciclo3MJR.repository.CinemaRepository;
import co.usa.ciclo3MJR.ciclo3MJR.repository.MensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MensajeService {
    @Autowired
    private MensajeRepository mensajeRepository;

    //Este servicio (cinemaRepository) se encarga de llamar los dos metodos definidos en cinemaRepository
    public List<Mensaje> getAll(){
        return mensajeRepository.getAll();
    }

    public Optional<Mensaje> getMensaje (int id){
        return mensajeRepository.getMensaje(id);
    }
    //Estas son unas restricciones de logica del programa
    public Mensaje save(Mensaje m){
        if(m.getId()==null){
            return mensajeRepository.save(m);
        }
        else{
            Optional<Mensaje> mensajeaux=mensajeRepository.getMensaje(m.getId());
            if(mensajeaux.isEmpty()){
                return mensajeRepository.save(m);
            }
            else{
                return m;
            }
        }
    }

}
