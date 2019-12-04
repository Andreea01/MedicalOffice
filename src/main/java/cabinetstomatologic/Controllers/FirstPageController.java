package cabinetstomatologic.Controllers;


import cabinetstomatologic.Dao.PacientRepository;
import cabinetstomatologic.Pacients.Pacient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@ComponentScan
@CrossOrigin(origins = "http://localhost:4200")
public class FirstPageController {

    private final PacientRepository pacientRepository;

    public FirstPageController(PacientRepository pacientRepository) {
        this.pacientRepository = pacientRepository;
    }

    @GetMapping("/users")
    public List<Pacient> getUsers() {
        return pacientRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody Pacient user) {
        pacientRepository.save(user);
    }
}

