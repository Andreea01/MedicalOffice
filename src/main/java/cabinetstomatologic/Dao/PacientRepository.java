package cabinetstomatologic.Dao;

import cabinetstomatologic.Pacients.Pacient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan
public interface PacientRepository extends MongoRepository<Pacient, Long> {}
