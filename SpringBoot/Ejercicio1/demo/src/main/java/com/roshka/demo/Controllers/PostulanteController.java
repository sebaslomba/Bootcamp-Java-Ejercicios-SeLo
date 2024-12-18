package com.roshka.demo.Controllers;

import com.roshka.demo.Models.PostulanteModel;
import com.roshka.demo.Service.PostulanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/postulantes")
public class PostulanteController
{
    @Autowired
    PostulanteService postulanteService;

    @GetMapping
    public ArrayList<PostulanteModel> findAllPostulantes()
    {
        return this.postulanteService.findAllPostulantes();
    }

    @PostMapping
    public PostulanteModel savePostulante(@RequestBody PostulanteModel postulante)
    {
        return this.postulanteService.savePostulante(postulante);
    }

   /* @DeleteMapping(path = "/{nroCedula}")
    public String deletePostulante(@PathVariable("nroCedula") Integer nroCedula)
    {
        boolean result = this.postulanteService.deletePostulantebyNroCedula(nroCedula);
        return result ? "Se elimino correctamente" : "No pudo eliminarse";

    }*/
   @DeleteMapping(path = "/BorrarPorCedula/{nroCedula}")
    public ResponseEntity<Void> deletePostulanteByNroCedula(@PathVariable("nroCedula") int nroCedula) {
        postulanteService.deletePostulantebyNroCedula(nroCedula);
        return ResponseEntity.noContent().build();
    }
}
