package com.roshka.demo.Controllers;

import com.roshka.demo.Models.PostulanteLenguajeModel;
import com.roshka.demo.Service.PostulanteLenguajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/Postulante/Lenguajes")
public class PostulanteLenguajeController {
    @Autowired
    PostulanteLenguajeService postulanteLenguajeService;

    @GetMapping
    public ArrayList<PostulanteLenguajeModel> findAllPostulanteLenguajes()
    {
        return this.postulanteLenguajeService.findAllPostulanteLenguajes();
    }
    @PostMapping
    public PostulanteLenguajeModel savePostulanteLenguaje(@RequestBody PostulanteLenguajeModel postulante)
    {
        return this.postulanteLenguajeService.savePostulanteLenguaje(postulante);
    }

    @DeleteMapping(path = "/{id}")
    public String deletePostulanteLenguaje(@PathVariable("id") Integer id)
    {
        boolean result = this.postulanteLenguajeService.deletePostulanteLenguaje(id);
        return result ? "Se elimino correctamente" : "No pudo eliminarse";
    }
}
