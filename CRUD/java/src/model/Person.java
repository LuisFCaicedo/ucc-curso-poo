package model;

public class Person {

    private int id;
    private int idnumero;
    private String idTipo;
    private String nombre;
    private String apellido;
    private String genero;
    private String correo;
    private String telefono;

    public Person(){}

    public Person(int id, int idnumero, String idtipo, String nombre, String apellido, String genero, 
                 String correo, String telefono){

        this.id=id;
        this.idnumero=idnumero;
        this.idTipo = idtipo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.correo = correo;
        this.telefono = telefono;

    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getIdNumero(){
        return this.idnumero;
    }

    public void setIdNumero(int idnumero){
        this.idnumero = idnumero;
    }

    public String getIdTipo(){
        return this.idTipo;
    }

    public void setIdTipo(String idTipo){
        this.idTipo = idTipo;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getCorreo(){
        return this.correo;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }



    


}