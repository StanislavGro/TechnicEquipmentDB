package com.technics.infsystem.repository.equipments;

import com.technics.infsystem.entities.equipments.RefrigeratorEquipment;
import com.technics.infsystem.entities.equipments.TVEquipment;
import com.technics.infsystem.repository.common.CommonEquipmentRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RefrigeratorEquipmentRepository extends CommonEquipmentRepository<RefrigeratorEquipment> {

    @Query("select re from RefrigeratorEquipment re where re.typeName = lower(:typeName)")
    List<RefrigeratorEquipment> findByTypeName(@Param("typeName") String typeName);

}
