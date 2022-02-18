package com.technics.infsystem.repository.models;

import com.technics.infsystem.entities.models.VacuumCleanerModel;
import com.technics.infsystem.repository.common.CommonModelRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VacuumCleanerModelRepository extends CommonModelRepository<VacuumCleanerModel> {
    @Query("select vcm from VacuumCleanerModel vcm where vcm.modelName = lower(:modelName)")
    List<VacuumCleanerModel> findByModelName(@Param("modelName") String modelName);

    @Query("select vcm from VacuumCleanerModel vcm where vcm.color = lower(:color)")
    List<VacuumCleanerModel> findByColor(@Param("color") String color);

    @Query("select vcm from VacuumCleanerModel vcm where vcm.price >= :from and vcm.price<=:to")
    List<VacuumCleanerModel> findByPrice(@Param("from") int from, @Param("to") int to);

    @Query("select vcm from VacuumCleanerModel vcm order by vcm.price, vcm.color")
    List<VacuumCleanerModel> incrSortByPriceAndColor();

    @Query("select vcm from VacuumCleanerModel vcm order by vcm.price, vcm.color desc")
    List<VacuumCleanerModel> decrSortByPriceAndColor();
}
