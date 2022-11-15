package com.hfg.loginsocialcore.service;

import com.hfg.loginsocialcore.entity.Rol;
import com.hfg.loginsocialcore.enums.RolNombre;
import com.hfg.loginsocialcore.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

    public boolean existsRolNombre(RolNombre rolNombre){
        return rolRepository.existsByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }
}
