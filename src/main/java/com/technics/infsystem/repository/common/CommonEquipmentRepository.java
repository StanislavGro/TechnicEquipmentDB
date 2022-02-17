package com.technics.infsystem.repository.common;

import com.technics.infsystem.entities.abstraction.AbstractEquipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CommonEquipmentRepository<E extends AbstractEquipment> extends JpaRepository<E, Long> {
}
