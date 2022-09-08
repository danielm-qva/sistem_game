package com.sistem.game.entitys;

import javax.persistence.*;

@Entity
public class UsuarioRol {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long usuarioRolID;


    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario user;

    @ManyToOne
    private Roles roles;

    public Long getUsuarioRolID() {
        return usuarioRolID;
    }

    public void setUsuarioRolID(Long usuarioRolID) {
        this.usuarioRolID = usuarioRolID;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public UsuarioRol() {
    }
}
