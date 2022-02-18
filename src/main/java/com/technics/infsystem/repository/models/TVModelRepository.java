package com.technics.infsystem.repository.models;

import com.technics.infsystem.entities.models.PCModel;
import com.technics.infsystem.entities.models.SmartphoneModel;
import com.technics.infsystem.entities.models.TVModel;
import com.technics.infsystem.repository.common.CommonModelRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TVModelRepository extends CommonModelRepository<TVModel> {
    @Query("select tm from TVModel tm where tm.modelName = lower(:modelName)")
    List<TVModel> findByModelName(@Param("modelName") String modelName);

    @Query("select tm from TVModel tm where tm.color = lower(:color)")
    List<TVModel> findByColor(@Param("color") String color);

    @Query("select tm from TVModel tm where tm.price >= :from and tm.price<=:to")
    List<TVModel> findByPrice(@Param("from") int from, @Param("to") int to);
}
