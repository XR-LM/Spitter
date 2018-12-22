package spitter.pojo;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 用户类
 * @author XR
 *
 */
public class Spitter {
	private Long id;
	
	@NotBlank   //只能作用在String上，不能为null，而且调用trim()后，长度必须大于0 
	@Length(min = 2, max = 5, message = "用户名长度必须为2-5")
	private String username;
	
	@NotBlank
	@Length(min = 2, max = 5, message = "密码长度必须为2-5")
	private String password;
	
	@NotBlank
	private String firstName;
	
	@NotBlank
	private String lastName;
	
	Spitter() {}
	
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
