package project.analisis2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;
@Entity
public class Usuario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String usuario;
    private String password;
    private String role;

    public Usuario(String name, String usuario, String password, String role) {
        this.name = name;
        this.usuario = usuario;
        this.password = password;
        this.role = role;
    }

    public Usuario() {
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



    public String getPassword() {
        return password;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getusuario() {
        return usuario;
    }

    public void setusuario(String usuario) {
        this.usuario = usuario;
    }

  

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }
}
