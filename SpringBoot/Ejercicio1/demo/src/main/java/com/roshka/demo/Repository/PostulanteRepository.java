package com.roshka.demo.Repository;

import com.roshka.demo.Models.PostulanteModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostulanteRepository extends CrudRepository<PostulanteModel, Integer>
{
    void deletePostulanteByNroCedula(Integer nroCedula);

    Optional<PostulanteModel> findByNroCedula(Integer nroCedula);
}
