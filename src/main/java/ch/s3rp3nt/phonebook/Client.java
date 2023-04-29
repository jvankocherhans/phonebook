package ch.s3rp3nt.phonebook;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "clients")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    private ObjectId id;
    private String type;
    private String phone_number;
    private String sur_name;
    private String last_name;
    private String street_name;
    private int street_number;
    private int postal_code;
    private String place;
    private boolean favorite;

    public Client(String type, String phone_number, String sur_name, String last_name, String street_name, int street_number, int postal_code, String place) {
        this.type = type;
        this.phone_number = phone_number;
        this.sur_name = sur_name;
        this.last_name = last_name;
        this.street_name = street_name;
        this.street_number = street_number;
        this.postal_code = postal_code;
        this.place = place;
    }
    
}
