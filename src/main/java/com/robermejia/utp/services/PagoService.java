package com.robermejia.utp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.robermejia.utp.entities.Pago;
import com.robermejia.utp.repositories.PagoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PagoService {

    private final PagoRepository repository;

    public List<Pago> getPagos(){
        return repository.findAll();
    }

    public Pago savePago(Pago pago){
        if(pago.getId()!=null && repository.existsById(pago.getId())){
            return new Pago();
        }
        return repository.save(pago);
    }
}
