/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptingboot.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sptingboot.springboot.entities.Regions;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import sptingboot.springboot.serviceInterface.serviceinterfaceimpl.RegionsDAO;

/**
 *
 * @author Panji Sadewo
 */
// Pemateri Aditya Kresna
@Controller
public class MainController {

    @Autowired
    RegionsDAO rdao;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("regionData", rdao.findAll());
        model.addAttribute("regionsave", new Regions());
        model.addAttribute("regionedit", new Regions());
        model.addAttribute("regiondelete", new Regions());
        return "index";
    }

    @RequestMapping(value = "/regionsave", method = RequestMethod.POST)  //@PostMapping("/regionsave")
    public String save(@ModelAttribute("regionsave") Regions regions) {
        rdao.saveRegion(regions);
        return "redirect:/";
    }
    
    @RequestMapping(value = "/regionedit", method = RequestMethod.POST)  //@PostMapping("/regionsave")
    public String edit(@ModelAttribute("regionedit") Regions regions) {
        rdao.saveRegion(regions);
        return "redirect:/";
    }
    
    @RequestMapping(value = "/regiondelete", method = RequestMethod.POST)  //@PostMapping("/regionsave")
    public String delete(@ModelAttribute("regionedit") Regions regions) {
        rdao.deleteRegionById(regions.getId());
        return "redirect:/";
    }
    
    @RequestMapping(value = "/regiondelete/{id}", method = RequestMethod.GET)  //@PostMapping("/regionsave")
    public ModelAndView delete(@PathVariable int id,ModelMap model) {
        rdao.deleteRegionById(id);
        return new ModelAndView("redirect:/");
    }
    
    
}
