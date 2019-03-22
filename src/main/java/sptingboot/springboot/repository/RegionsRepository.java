/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptingboot.springboot.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sptingboot.springboot.entities.Regions;

/**
 *
 * @author Panji Sadewo
 */
@Repository
                                                     //Ini model, Tipe Primary Key
public interface RegionsRepository extends CrudRepository<Regions, Integer>{
    
    @Modifying
    @Query(value = "DELETE FROM regions where id = ?1", nativeQuery = true)
    public void deleteById(Integer id);
}
