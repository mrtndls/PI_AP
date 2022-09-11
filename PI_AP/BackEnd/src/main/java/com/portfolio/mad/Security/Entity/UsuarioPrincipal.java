package com.portfolio.mad.Security.Entity;

import java.util.Collection;

public class UsuarioPrincipal implements UserDetails{
    private String nombre;
    private String nombreUsuario;
    private String email;
    private String password;
    private Collection<?extends GrantedAuthority> authorities;

    //constructor
    public UsuarioPrincipal(String nombre, String nombreUsuario, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }
    
    public static UsuarioPrincipal build(Usuario usuario) {
        List<GrantedAuthority> authorities = usuario.getRoles().stream().map(rol -> new SimpledGrantedAuthority(rol.getRolNombre().name())).collect(Collertors.toList());
    
        return new UsuarioPrincipal(usuario.getNombre(),usuario.getNombreUsuario(),usuario.getEmail(),usuario.getPassword(),authorities);
    }
    
    
}
