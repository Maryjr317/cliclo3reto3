package co.usa.ciclo3MJR.ciclo3MJR.web;

import co.usa.ciclo3MJR.ciclo3MJR.model.Categoria;
import co.usa.ciclo3MJR.ciclo3MJR.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//Determina almenos la primera parte de la url total
@RequestMapping("/api/Category")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    //Metodo get para obtener todos los elementos con su url
    @GetMapping("/all")
    public List<Categoria> getCategoria(){
        return categoriaService.getAll();
    }

    //Metodo get para obtener solo los datos de un id
    @GetMapping("/{id}")
    public Optional<Categoria> getCategoria(@PathVariable ("id") int id){
        return categoriaService.getCategoria(id);
    }

    //Metodo post se pone Status.CREATED para dar un 201 y guarda los datos
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria save(@RequestBody Categoria c){
        return categoriaService.save(c);
    }
}
