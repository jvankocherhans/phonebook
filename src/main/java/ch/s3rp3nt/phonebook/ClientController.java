package ch.s3rp3nt.phonebook;

import java.rmi.server.ObjID;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
        return new ResponseEntity<List<Client>>(clientService.allClients(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Map<String, String> payload) {
        return new ResponseEntity<Client>(clientService.createClient(payload.get("type"), payload.get("phone_number"), payload.get("sur_name"), payload.get("last_name"), payload.get("street_name"), Integer.parseInt(payload.get("street_number")), Integer.parseInt(payload.get("postal_code")), payload.get("place")), HttpStatus.CREATED);
    }

    // @GetMapping("/{id}")
    // public ResponseEntity<Optional<Client>> getClient(@PathVariable ObjectId id) {
    //     return new ResponseEntity<Optional<Client>>(clientService.client(id), HttpStatus.OK);
    // }
}
