package com.apiSekoalh.repository;

import com.apiSekoalh.models.SiswaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KelasRepository extends JpaRepository<SiswaModel, Long> {}
