package entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "minha_tabela")
public class User implements Serializable{
	String Id;
	String name;
	String email;
	String telefone;
	String password;
	
	private static final long serialVersionUID = 1L;
	
	public User() {
		
	}
	
	public User(String Id, String name, String email, String telefone, String password) {
		this.Id = Id;
		this.name = name;
		this.email = email;
		this.telefone = telefone;
		this.password = password;
	}
	
    public String getId() {
        return this.Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
	
	
    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getemail() {
        return this.email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String gettelefone() {
        return this.telefone;
    }

    public void settelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getpassword() {
        return this.password;
    }

    public void setpassword(String password) {
        this.password = password;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        User user = (User) obj;
        return Id.equals(user.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }
	
}
