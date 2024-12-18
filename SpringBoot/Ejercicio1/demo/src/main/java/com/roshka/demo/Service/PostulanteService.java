package com.roshka.demo.Service;

import com.roshka.demo.Models.PostulanteModel;
import com.roshka.demo.Repository.PostulanteRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class PostulanteService
{
    @Autowired
    PostulanteRepository postulanteRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public ArrayList<PostulanteModel> findAllPostulantes()
    {
        return (ArrayList<PostulanteModel>) postulanteRepository.findAll();
    }

    public PostulanteModel savePostulante(PostulanteModel postulante)
    {
        entityManager.clear();
        return postulanteRepository.save(postulante);
    }

      public void deletePostulantebyNroCedula(Integer nroCedula)
    {
        Optional<PostulanteModel> postulante = postulanteRepository.findByNroCedula(nroCedula).stream().findFirst();
        if (postulante.isPresent()) {
            postulanteRepository.delete(postulante.get());
        } else {
            throw new RuntimeException("No encontrado Cedula: " + nroCedula);
        }
    }

    public PostulanteModel obtenerPostulantePorId(Integer nroCedula) {
        Optional<PostulanteModel> existente = postulanteRepository.findById(nroCedula);
        if (!existente.isPresent()) {
            throw new EntityNotFoundException("El postulante con numero de cedula: " + nroCedula + " no existe.");
        }
        return existente.get();
    }

    public PostulanteModel guardarPostulante(PostulanteModel postulante) {
        return postulanteRepository.save(postulante);
    }
}
