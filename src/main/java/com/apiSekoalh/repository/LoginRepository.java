package com.apiSekoalh.repository;

import com.apiSekoalh.models.LoginModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<LoginModel, Long> {}
