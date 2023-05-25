package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PersonDAO {

    private PreparedStatement pst;
    private ResultSet rs;
    
    public boolean addPerson (Person person){

        boolean state = false;
        Connection connect = null;

        try{

            connect = ConnectionPool.getInstance().getConnection();

            if(connect != null){

                String sql = "INSERT INTO persona (id_numero, id_tipo, nombre, apellido, genero, correo, telefono) VALUES (?,?,?,?,?,?,?)";

                pst = connect.prepareStatement(sql);

                pst.setInt(1, person.getIdNumero());
                pst.setString(2, person.getIdTipo());
                pst.setString(3, person.getNombre());
                pst.setString(4, person.getApellido());
                pst.setString(6, person.getGenero());
                pst.setString(7, person.getCorreo());
                pst.setString(8, person.getTelefono());
                pst.setInt(9, 1);

                int res = pst.executeUpdate();

                state = res > 0;

            }else{
                System.out.println("Conexión Fallida");
            }


        }catch(Exception ex){

            System.out.println(ex.getMessage());
        
        }finally{
            try {
                ConnectionPool.getInstance().closeConnection(connect);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


        return state;
    }

    public ArrayList<Person> selectPerson(String filter, ArrayList<String> data){

        ArrayList<Person> list = new ArrayList<>();
        Person person;

        Connection connect = null;

        try{

            connect = ConnectionPool.getInstance().getConnection();

            if(connect != null){

                String sql="";

                switch (filter) {
                    
                    case "Name":  
                        sql = "SELECT * FROM persona WHERE name REGEXP ? AND last_name REGEXP ? AND state=1";
                        pst = connect.prepareStatement(sql);
                        pst.setString(1, data.get(0));
                        pst.setString(2, data.get(0));                                             
                    break;
                
                    case "IDNumber":                        
                        sql = "SELECT * FROM persona WHERE id_type=? AND id_number=? AND state=1";
                        pst = connect.prepareStatement(sql);
                        pst.setString(1, data.get(0));
                        pst.setInt(2, Integer.parseInt(data.get(1)));                                             
                    break;

                    default:
                        sql = "SELECT * FROM persona WHERE 1 AND state=1";
                        pst = connect.prepareStatement(sql);                    
                    break;

                }

                rs = pst.executeQuery();

                while(rs.next()){

                    person = new Person();
                    
                    person.setId(rs.getInt("id"));
                    person.setIdTipo(rs.getString("id_type"));
                    person.setIdNumero(rs.getInt("id_number"));
                    person.setNombre(rs.getString("name"));
                    person.setApellido(rs.getString("last_name"));
                    person.setCorreo(rs.getString("email"));
                    person.setTelefono(rs.getString("phone"));
                    person.setGenero(rs.getString("gender"));

                    list.add(person);

                }


            }else{
                System.out.println("Conexión Fallida");
            }


        }catch(Exception ex){

            System.out.println(ex.getMessage());
        
        }finally{
            try {
                ConnectionPool.getInstance().closeConnection(connect);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }        


        return list;

    }

    public boolean updatePerson(Person person){

        boolean state = false;
        Connection connect = null;

        try{

            connect = ConnectionPool.getInstance().getConnection();

            if(connect != null){

                String sql = "UPDATE persona SET id_type=?, id_number=?, name=?, last_name=?, phone=?, email=?, date_of_birth=?, gender=? WHERE id=?";

                pst = connect.prepareStatement(sql);
                pst.setString(1, person.getIdTipo());
                pst.setInt(2, person.getIdNumero());
                pst.setString(3, person.getNombre());
                pst.setString(4, person.getApellido());
                pst.setString(5, person.getTelefono());
                pst.setString(6, person.getCorreo());
                pst.setString(8, person.getGenero());
                pst.setInt(9, person.getId());

                int res = pst.executeUpdate();

                state = res > 0;

            }else{
                System.out.println("Conexión Fallida");
            }


        }catch(Exception ex){

            System.out.println(ex.getMessage());
        
        }finally{
            try {
                ConnectionPool.getInstance().closeConnection(connect);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


        return state;


    }

    public boolean deletePerson(int id){

        boolean state = false;
        Connection connect = null;

        try{

            connect = ConnectionPool.getInstance().getConnection();

            if(connect != null){

                //String sql = "DELETE FROM persona WHERE id=?";

                String sql = "UPDATE persona SET state=? WHERE id=?";

                pst = connect.prepareStatement(sql);
                pst.setInt(1, 0);
                pst.setInt(2, id);

                int res = pst.executeUpdate();

                state = res > 0;

            }else{
                System.out.println("Conexión Fallida");
            }


        }catch(Exception ex){

            System.out.println(ex.getMessage());
        
        }finally{
            try {
                ConnectionPool.getInstance().closeConnection(connect);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


        return state;


    }

    

}