package com.apiSekoalh.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "kelas")
@EntityListeners(AuditingEntityListener.class)
public class KelasModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  private String id_pegawai;

  @NotBlank
  private String kelas;

  @NotBlank
  private String kode;

  public void setid(Long id) {
    this.id = id;
  }

  public void setid_pegawai(String id_pegawai) {
    this.id_pegawai = id_pegawai;
  }

  public void setkelas(String kelas) {
    this.kelas = kelas;
  }

  public void setkode(String kode) {
    this.kode = kode;
  }

  public Long getid() {
    return id;
  }

  public String getid_pegawai() {
    return id_pegawai;
  }

  public String getkelas() {
    return kelas;
  }

  public String getkode() {
    return kode;
  }
}
