package com.roshka.demo.Service;

import com.roshka.demo.Models.PostulanteLenguajeModel;
import com.roshka.demo.Models.PostulanteModel;
import com.roshka.demo.Repository.PostulanteLenguajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class PostulanteLenguajeService
{
    @Autowired
    PostulanteLenguajeRepository postulanteLenguajeRepository;

    public ArrayList<PostulanteLenguajeModel> findAllPostulanteLenguajes()
    {
        return (ArrayList<PostulanteLenguajeModel>) postulanteLenguajeRepository.findAll();
    }

    public PostulanteLenguajeModel savePostulanteLenguaje(PostulanteLenguajeModel lenguaje)
    {
        return postulanteLenguajeRepository.save(lenguaje);
    }

    public boolean deletePostulanteLenguaje(Integer id)
    {
        try
        {
            postulanteLenguajeRepository.deleteById(id);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
