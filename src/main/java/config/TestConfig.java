package config;
import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import entities.User;
import services.UserService;
import repositories.UserRepository;

public class TestConfig implements CommandLineRunner{
    private UserRepository userRepository;
	
	@Autowired
	public TestConfig(UserRepository userRepository){
		this.userRepository = userRepository;
	}
	
	public void run() {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		userRepository.saveAll(Arrays.asList(u1, u2));

	}
	
	@Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner executado");
    }

}
