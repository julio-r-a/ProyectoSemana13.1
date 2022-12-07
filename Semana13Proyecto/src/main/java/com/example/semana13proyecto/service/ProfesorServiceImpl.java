package com.example.semana13proyecto.service;


import com.example.semana13proyecto.dto.ProfesorDTO;
import com.example.semana13proyecto.model.Profesor;
import com.example.semana13proyecto.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfesorServiceImpl implements ProfesorService {

    @Autowired
    private ProfesorRepository repository;

    @Override
    public List<ProfesorDTO> listar() {

        List<ProfesorDTO> listadto = new ArrayList<>();
        ProfesorDTO dto = null;

        for (Profesor profesor : repository.findAll()) {
            dto = new ProfesorDTO();
            dto.setApe(profesor.getApellido());
            dto.setNom(profesor.getNombre());
            dto.setCod(profesor.getIdProfesor());
            listadto.add(dto);
        }


        return listadto;

    }

    @Override
    public ProfesorDTO obtenerId(Integer id) {

        Profesor Profesor = repository.findById(id).orElse(null);

        ProfesorDTO dto = new ProfesorDTO();
        dto.setApe(Profesor.getApellido());
        dto.setNom(Profesor.getNombre());
        dto.setCod(Profesor.getIdProfesor());

        return dto;
    }

    @Override
    public void guardar(ProfesorDTO profesor) {

        Profesor pro = new Profesor();
        pro.setApellido(profesor.getApe());
        pro.setNombre(profesor.getNom());
        pro.setIdProfesor(profesor.getCod());

        repository.save(pro);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void actualizar(ProfesorDTO profesor) {

        Profesor alu = new Profesor();
        alu.setApellido(profesor.getApe());
        alu.setNombre(profesor.getNom());
        alu.setIdProfesor(profesor.getCod());

        repository.saveAndFlush(alu);
    }
}
