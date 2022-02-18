package com.technics.infsystem.repository.models;

import com.technics.infsystem.entities.models.PCModel;
import com.technics.infsystem.entities.models.RefrigeratorModel;
import com.technics.infsystem.entities.models.SmartphoneModel;
import com.technics.infsystem.repository.common.CommonModelRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SmartphoneModelRepository extends CommonModelRepository<SmartphoneModel> {
    @Query("select sm from SmartphoneModel sm where sm.modelName = lower(:modelName)")
    List<SmartphoneModel> findByModelName(@Param("modelName") String modelName);

    @Query("select sm from SmartphoneModel sm where sm.color = lower(:color)")
    List<SmartphoneModel> findByColor(@Param("color") String color);

    @Query("select sm from SmartphoneModel sm where sm.price >= :from and sm.price<=:to")
    List<SmartphoneModel> findByPrice(@Param("from") int from, @Param("to") int to);
}
