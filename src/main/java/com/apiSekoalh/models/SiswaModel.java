package com.apiSekoalh.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "siswa")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class SiswaModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  private String nama;

  @NotBlank
  private String nisn;

  @NotBlank
  private String jk;

  @NotBlank
  private String kelas;

  // @Column(nullable = false, updatable = false)
  // @Temporal(TemporalType.TIMESTAMP)
  // @CreatedDate
  // private Date CreatedAt;

  // @Column(nullable = false)
  // @Temporal(TemporalType.TIMESTAMP)
  // @LastModifiedDate
  // private Date updatedAt;

  public Long getId() {
    return id;
  }

  public void SetId(Long id) {
    this.id = id;
  }

  public String getnama() {
    return nama;
  }

  public String getnisn() {
    return nisn;
  }

  public String getjk() {
    return jk;
  }

  public void setnama(String nama) {
    this.nama = nama;
  }

  public void setnisn(String nisn) {
    this.nisn = nisn;
  }

  public void setjk(String jk) {
    this.jk = jk;
  }

  public void setkelas(String kelas) {
    this.kelas = kelas;
  }

  public String getkelas() {
    return kelas;
  }
  // public Date setUpdatedAt(Date CreatedAt) {
  //   return updatedAt;
  // }

  // public Date setCreatedAt(Date CreatedAt) {
  //   return CreatedAt;
  // }
  // public Date getUpdatedAt() {
  //   return updatedAt;
  // }

  // public Date getCreatedAt() {
  //   return CreatedAt;
  // }
}
