/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptingboot.springboot.serviceInterface.serviceinterfaceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sptingboot.springboot.entities.Regions;
import sptingboot.springboot.serviceInterface.IRegionDAO;
import sptingboot.springboot.repository.RegionsRepository;

/**
 *
 * @author Panji Sadewo
 */
@Service
public class RegionsDAO implements IRegionDAO{

    @Autowired
    RegionsRepository regionRepository;
    
    @Override
    public Iterable<Regions> findAll() {
        return regionRepository.findAll();
    }

    @Override
    public Regions saveRegion(Regions regions) {
       return regionRepository.save(regions);
    }

    @Override
    public void deleteRegionById(Integer id) {
        regionRepository.deleteById(id);
    }
    
}
