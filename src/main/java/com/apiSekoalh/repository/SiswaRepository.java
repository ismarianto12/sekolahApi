package com.apiSekoalh.repository;

import com.apiSekoalh.models.SiswaModel;
import org.springframework.data.jpa.repository.JpaRepository;

// public class SiswaRepository {}
public interface SiswaRepository extends JpaRepository<SiswaModel, Long> {}
