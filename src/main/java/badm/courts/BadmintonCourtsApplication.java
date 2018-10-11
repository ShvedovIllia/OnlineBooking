package badm.courts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import badm.courts.entity.User;
import badm.courts.entity.enums.UserRoles;
import badm.courts.repository.UserRepository;

@SpringBootApplication
public class BadmintonCourtsApplication implements CommandLineRunner {

	public static void main(String[] args) {
	SpringApplication.run(BadmintonCourtsApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public void run(String... args) throws Exception {
		
		if(userRepository.count() == 0) {
			User user = new User();
			
			user.setUsername("admin");
			user.setPassword("admin");
			user.setFirstName("admin");
			user.setLastName("admin");
			user.setRole(UserRoles.ROLE_ADMIN);
			user.setPassword(passwordEncoder.encode("admin"));
			
			userRepository.save(user);
			
			
		}
		
	}
}
