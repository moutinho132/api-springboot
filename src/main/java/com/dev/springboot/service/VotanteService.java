package com.dev.springboot.service;

import com.dev.springboot.model.Votante;
import org.springframework.stereotype.Component;

@Component
public class VotanteService {

    public Votante buscarVotante(String cedula){
        Votante votante = mock();
        if(cedula !=null && cedula.trim().length()>0 && cedula.equals(votante.getCedula())){
            return votante;
        }else{
            return null;
        }
    }


    public Votante mock(){
        return  Votante.builder()
                .email("jose@gmail.com")
                .name("jose")
                .cedula("17222222")
                .build();
    }
}
