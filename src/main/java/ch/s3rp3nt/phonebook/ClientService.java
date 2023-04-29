package ch.s3rp3nt.phonebook;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> allClients() {
        return clientRepository.findAll();
    }

    public Optional<Client> client(ObjectId id) {
        return clientRepository.findById(id);
    }

    public Client createClient(String type, String phone_number, String sur_name, String last_name, String street_name, int street_number, int postal_code, String place) {
        Client client = clientRepository.insert(new Client(type, phone_number, sur_name, last_name, street_name,street_number, postal_code, place));
        
        return client;
    }
}
