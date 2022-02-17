package com.technics.infsystem.repository.common;

import com.technics.infsystem.entities.abstraction.AbstractModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CommonModelRepository<M extends AbstractModel> extends JpaRepository<M, Long> {
}
