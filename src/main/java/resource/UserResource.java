package resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import services.UserService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value = "/users")

public class UserResource {
	private UserService userService;
	
	@Autowired
	public UserResource(UserService userService) {
		this.userService = userService;
	}
	
    @GetMapping("/findAll")
    public String findAll() {
        return "findAll";
    }
    
    @GetMapping("/findById")
    public String findById() {
        return "findById";
    }
    
    @PostMapping("/insert")
    public String insert(@RequestBody String corpoRequisicao) {
        return "Resposta para a requisição POST";
    }
    
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        return "Resposta para a requisição DELETE";
    }
    
    @PutMapping("/update/{id}")
    public String update(@PathVariable String id, @RequestBody String novoConteudo) {
        return "Resposta para a requisição PUT";
    }
}
