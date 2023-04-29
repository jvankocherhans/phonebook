package ch.s3rp3nt.phonebook;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.bson.types.ObjectId;

@Repository
public interface ClientRepository extends MongoRepository<Client, ObjectId> {
    
}
