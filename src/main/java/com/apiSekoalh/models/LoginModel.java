package com.apiSekoalh.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "login")
@EntityListeners(AuditingEntityListener.class)
public class LoginModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  private String username;

  @NotBlank
  private String password;

  @NotBlank
  private String level;

  public void setid(Long id) {
    this.id = id;
  }

  public void setUsername(String Username) {
    this.username = Username;
  }

  public void setPassword(String Password) {
    this.password = Password;
  }

  public void setlevel(String level) {
    this.level = level;
  }

  public Long getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getlevel() {
    return level;
  }

  public void setAttribute(String string, String username2) {}
}
