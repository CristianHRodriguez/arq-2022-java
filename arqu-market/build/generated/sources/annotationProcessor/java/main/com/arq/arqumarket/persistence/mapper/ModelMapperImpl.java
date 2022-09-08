package com.arq.arqumarket.persistence.mapper;

import com.arq.arqumarket.domain.Model;
import com.arq.arqumarket.persistence.entity.Modelo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-08T16:47:04-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.16 (Ubuntu)"
)
@Component
public class ModelMapperImpl implements ModelMapper {

    @Override
    public Model toModel(Modelo modelo) {
        if ( modelo == null ) {
            return null;
        }

        Model model = new Model();

        model.setModelName( modelo.getNombre() );
        if ( modelo.getIdModelo() != null ) {
            model.setModelId( modelo.getIdModelo() );
        }

        return model;
    }

    @Override
    public Modelo toModelo(Model model) {
        if ( model == null ) {
            return null;
        }

        Modelo modelo = new Modelo();

        modelo.setIdModelo( model.getModelId() );
        modelo.setNombre( model.getModelName() );

        return modelo;
    }
}
