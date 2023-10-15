package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void findAll() {
	
	};
	
	public void findById() {
		
	};
	
	public void insert() {
		
	};
		
	public void delete() {
		
	};
	
	public void update() {
		
	};
}
