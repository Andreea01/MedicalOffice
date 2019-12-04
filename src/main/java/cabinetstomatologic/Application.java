package cabinetstomatologic;

import cabinetstomatologic.Dao.PacientRepository;
import cabinetstomatologic.Pacients.Pacient;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoDatabase;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        // Creating a Mongo client
        MongoClient mongo = new MongoClient( "localhost" , 27017 );

        // Creating Credentials
        MongoCredential credential;
        credential = MongoCredential.createCredential("", "local",
                "".toCharArray());
        System.out.println("Connected to the database successfully");

        // Accessing the database
        MongoDatabase database = mongo.getDatabase("local");
        System.out.println("Credentials ::"+ credential);
    }

    @Bean
    CommandLineRunner init(PacientRepository pacientRepository) {
        return args -> {
            Iterable<Pacient> list = pacientRepository.findAll();
            for(Pacient pacient:list){
                System.out.println(pacient.getCnp() + ", " + pacient.getFirstName() + ", " + pacient.getLastName());
            }
        };
    }

}
