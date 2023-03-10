package com.apiSekoalh.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "notes")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class SiswaModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  private String nama;

  @NotBlank
  private String Nik;

  @NotBlank
  private String Jk;

  @Column(nullable = false, updatable = false)
  @Temporal(TemporalType.TIMESTAMP)
  @CreatedDate
  private Date CreatedAt;

  @Column(nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  @LastModifiedDate
  private Date updatedAt;

  public Long getId() {
    return id;
  }

  public void SetId(Long id) {
    this.id = id;
  }

  public String getnama() {
    return nama;
  }

  public String getNik() {
    return Nik;
  }

  public String getJk() {
    return Jk;
  }

  public void setnama(String nama) {
    this.nama = nama;
  }

  public void setNik(String Nik) {
    this.Nik = Nik;
  }

  public void setJk(String Jk) {
    this.Jk = Jk;
  }

  public Date setUpdatedAt(Date CreatedAt) {
    return updatedAt;
  }

  public Date setCreatedAt(Date CreatedAt) {
    return CreatedAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public Date getCreatedAt() {
    return CreatedAt;
  }
}
