package com.iraheta;

import com.iraheta.Exception.ErrorValidacion;

public class Cliente {
    private String id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    public Cliente(String id, String nombre, String apellido){

    }

    public String getId() {
        return id;
    }
    public void setId(String id) throws Exception{
        if (id.length() !=13){
            throw new ErrorValidacion("El numero de indentidad debe contener 13 caracteres");
        }
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreCompleto(){
        return this.nombre+ "" + this.apellido;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) throws ErrorValidacion {
        if(!telefono.matches("^(\\+504\\s?)[0-9]{4}\\-?[0-9]{4}")){//metodo que duelve vo f
            throw new ErrorValidacion("El numero de telefono es invalido");
        }
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) throws ErrorValidacion {
        if(!email.matches("^([a-z0-9._%-]+@[a-z0-9]+\\.[a-z]{2,3})")){
            throw new ErrorValidacion("El correo es invalido");
        }
        this.email = email;
    }
}
 // publica se puede usar en todas
//privada solo se puede usar en esa clase
//protegida se puede usar en la clase y herencia


//array normal
//array simple y doble, se integran pilas y colas
//pilas-->el ultimo es el primero en salir como una pila de libros
//colas--> el primero llegar es el primero en salir.

/*getters--> utilizador para devolver info
* setters--> utilizados para modificar el estado de mi objeto
* getNombre(){}
* setNombre(String nuevoNombre){} devuelve void
* expresiones regulares es para encontrar patrones en le texto, son una especificacion*/