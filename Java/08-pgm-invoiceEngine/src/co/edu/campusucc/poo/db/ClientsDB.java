package co.edu.campusucc.poo.db;

import java.util.HashMap;
import co.edu.campusucc.poo.models.Client;

public class ClientsDB {


    private HashMap<Integer, Client> clients;

    public ClientsDB() {
        this.clients = new HashMap<>();
    }

    public HashMap<Integer, Client> getClients() {
        return clients;
    }

    public void setClients(HashMap<Integer, Client> clients) {
        this.clients = clients;
    }

    
}