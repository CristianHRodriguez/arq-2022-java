package com.arq.arqumarket.persistence.mapper;

import com.arq.arqumarket.domain.Material;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface MaterialMapper {

    @Mappings({
            @Mapping(source = "idMaterial", target = "materialId"),
            @Mapping(source = "nombre", target = "materialName"),
    })
    Material toMaterialDom(com.arq.arqumarket.persistence.entity.Material material);

    //cuando quiero ignorar un atributo de una clase al ser mapeado, uso ignore
    @InheritInverseConfiguration
    @Mapping(target = "productosMa", ignore = true)
    com.arq.arqumarket.persistence.entity.Material toMaterialPer(Material material);
}
