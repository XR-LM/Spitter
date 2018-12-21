package spitter.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 用户类
 * @author XR
 *
 */
public class Spitter {
	private Long id;
	
	@NotNull
	@Size(min=2,max=5)
	private String username;
	
	@NotNull
	@Size(min=2,max=5)
	private String password;
	
	@NotNull
	private String firstName;
	
	@NotNull
	private String lastName;
	
	Spitter() {}
	
	public Spitter(@NotNull @Size(min = 2, max = 5) String username, @NotNull @Size(min = 2, max = 5) String password,
			@NotNull String firstName, @NotNull String lastName) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
	
}
