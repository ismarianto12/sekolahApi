package com.apiSekoalh.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "pegawai")
@EntityListeners(AuditingEntityListener.class)
public class GuruModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  @NotEmpty(message = "Nama tidak boleh Kosong")
  
  private String nama;

  @NotBlank
  @NotEmpty(message = "Jenis Kelamin tidak boleh Kosong")
  private String jk;

  @NotBlank
  @NotEmpty(message = "Alamat tidak boleh Kosong")
  private String alamat;

  public void setid(Long id) {
    this.id = id;
  }

  public void setnama(String nama) {
    this.nama = nama;
  }

  public void setjk(String jk) {
    this.jk = jk;
  }

  public void setalamat(String alamat) {
    this.alamat = alamat;
  }

  public Long getid() {
    return id;
  }

  public String getnama() {
    return nama;
  }

  public String getjk() {
    return jk;
  }

  public String getalamat() {
    return alamat;
  }
}
