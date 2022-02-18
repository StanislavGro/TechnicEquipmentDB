package com.technics.infsystem.repository.models;

import com.technics.infsystem.entities.models.PCModel;
import com.technics.infsystem.repository.common.CommonModelRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PCModelRepository extends CommonModelRepository<PCModel> {

    @Query("select pcm from PCModel pcm where pcm.modelName = lower(:modelName)")
    List<PCModel> findByModelName(@Param("modelName") String modelName);

    @Query("select pcm from PCModel pcm where pcm.color = lower(:color)")
    List<PCModel> findByColor(@Param("color") String color);

    @Query("select pcm from PCModel pcm where pcm.price >= :from and pcm.price<=:to")
    List<PCModel> findByPrice(@Param("from") int from, @Param("to") int to);

    @Query("select pcm from PCModel pcm order by pcm.price, pcm.color")
    List<PCModel> incrSortByPriceAndColor();

    @Query("select pcm from PCModel pcm order by pcm.price, pcm.color desc")
    List<PCModel> decrSortByPriceAndColor();

}
