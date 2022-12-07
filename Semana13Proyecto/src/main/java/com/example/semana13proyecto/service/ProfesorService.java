package com.example.semana13proyecto.service;


import com.example.semana13proyecto.dto.ProfesorDTO;

import java.util.List;

public interface ProfesorService {

    List<ProfesorDTO>listar();
    ProfesorDTO obtenerId(Integer id);
    void guardar(ProfesorDTO profesor);
    void eliminar(Integer id);
    void actualizar(ProfesorDTO profesor);
}
