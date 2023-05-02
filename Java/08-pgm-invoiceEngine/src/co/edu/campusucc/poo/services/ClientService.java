package co.edu.campusucc.poo.services;

import co.edu.campusucc.poo.db.ClientsDB;
import co.edu.campusucc.poo.models.Client;

public class ClientService {
    private ClientsDB clientsDB;

    public ClientService(ClientsDB clientsDB) {
        this.clientsDB = clientsDB;
    }

    public void addClient(Client client) {
        clientsDB.getClients().put(client.getId(), client);
    }

    public Client getClientById(int id) {
    return clientsDB.getClients().get(id);
}
}