/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptingboot.springboot.serviceInterface;

import sptingboot.springboot.entities.Regions;

/**
 *
 * @author Panji Sadewo
 */
public interface IRegionDAO {
    Iterable<Regions> findAll();
    Regions saveRegion(Regions regions);
    void deleteRegionById(Integer id);
    
}
