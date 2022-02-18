package com.technics.infsystem.repository.models;

import com.technics.infsystem.entities.models.PCModel;
import com.technics.infsystem.entities.models.RefrigeratorModel;
import com.technics.infsystem.repository.common.CommonModelRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RefrigeratorModelRepository extends CommonModelRepository<RefrigeratorModel> {
    @Query("select rm from RefrigeratorModel rm where rm.modelName = lower(:modelName)")
    List<RefrigeratorModel> findByModelName(@Param("modelName") String modelName);

    @Query("select rm from RefrigeratorModel rm where rm.color = lower(:color)")
    List<RefrigeratorModel> findByColor(@Param("color") String color);

    @Query("select rm from RefrigeratorModel rm where rm.price >= :from and rm.price<=:to")
    List<RefrigeratorModel> findByPrice(@Param("from") int from, @Param("to") int to);
}
