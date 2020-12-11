
package com.model;


public class UsuariosModel {
    private int idUsu;
    private String usuario;
    private String pass;
    private int rol;

    public UsuariosModel() {
    }

    public UsuariosModel(int idUsu, String usuario, String pass, int rol) {
        this.idUsu = idUsu;
        this.usuario = usuario;
        this.pass = pass;
        this.rol = rol;
    }

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
    
    
}
