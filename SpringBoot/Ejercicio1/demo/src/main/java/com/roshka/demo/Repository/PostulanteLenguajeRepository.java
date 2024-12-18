package com.roshka.demo.Repository;

import com.roshka.demo.Models.PostulanteLenguajeModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostulanteLenguajeRepository extends CrudRepository<PostulanteLenguajeModel, Integer>
{

    Integer id(int id);
}
