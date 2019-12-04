package cabinetstomatologic.Pacients;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@ComponentScan
@Data
@AllArgsConstructor
@Document(collection="Pacients")
public class Pacient {
    @Id
    private String cnp;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

}

