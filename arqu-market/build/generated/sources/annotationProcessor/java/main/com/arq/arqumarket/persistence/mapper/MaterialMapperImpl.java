package com.arq.arqumarket.persistence.mapper;

import com.arq.arqumarket.domain.Material;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-08T16:47:04-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.16 (Ubuntu)"
)
@Component
public class MaterialMapperImpl implements MaterialMapper {

    @Override
    public Material toMaterialDom(com.arq.arqumarket.persistence.entity.Material material) {
        if ( material == null ) {
            return null;
        }

        Material material1 = new Material();

        if ( material.getIdMaterial() != null ) {
            material1.setMaterialId( material.getIdMaterial() );
        }
        material1.setMaterialName( material.getNombre() );

        return material1;
    }

    @Override
    public com.arq.arqumarket.persistence.entity.Material toMaterialPer(Material material) {
        if ( material == null ) {
            return null;
        }

        com.arq.arqumarket.persistence.entity.Material material1 = new com.arq.arqumarket.persistence.entity.Material();

        material1.setIdMaterial( material.getMaterialId() );
        material1.setNombre( material.getMaterialName() );

        return material1;
    }
}
