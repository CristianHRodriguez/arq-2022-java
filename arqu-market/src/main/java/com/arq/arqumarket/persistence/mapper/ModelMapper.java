package com.arq.arqumarket.persistence.mapper;

import com.arq.arqumarket.domain.Model;
import com.arq.arqumarket.persistence.entity.Modelo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ModelMapper {

    @Mappings({
            @Mapping(source = "idModelo", target = "modelId"),
            @Mapping(source = "nombre", target = "modelName"),
    })
    Model toModel(Modelo modelo);

    //cuando quiero ignorar un atributo de una clase al ser mapeado, uso ignore
    @InheritInverseConfiguration
    @Mapping(target = "productosMo", ignore = true)
    Modelo toModelo(Model model);
}
