package in.cravejava.app.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class User {
    @ID
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private final String name;
    private final String email;
    
}
