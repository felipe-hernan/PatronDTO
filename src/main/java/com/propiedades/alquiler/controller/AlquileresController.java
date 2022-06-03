
package com.propiedades.alquiler.controller;

import com.propiedades.alquiler.dto.PropiedadDTO;
import com.propiedades.alquiler.model.Inquilino;
import com.propiedades.alquiler.model.Propiedad;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlquileresController {
    
    @GetMapping("/propiedad/{id}")
    @ResponseBody
    public PropiedadDTO devolverPropiedad(@PathVariable Long id){
        
        Inquilino inqui = new Inquilino(1L, "12345678", "Walter", "white", "Porfesor");
        Propiedad prop = new Propiedad(152365L, "Casa", "308 Negra Arroyo Lane ", 200.0, 400000.0);
        
        
        PropiedadDTO propiDTO = new PropiedadDTO();
        
        propiDTO.setId_propiedad(prop.getId_propiedad());
        propiDTO.setTipo(prop.getTipo_propiedad());
        propiDTO.setDireccion(prop.getDireccion());
        propiDTO.setValor_alquiler(prop.getValor_alquiler());
        propiDTO.setNombre_inquilino(inqui.getNombre());
        propiDTO.setApellido_inquilino(inqui.getApellido());
        
        return propiDTO;
        
    }
}
