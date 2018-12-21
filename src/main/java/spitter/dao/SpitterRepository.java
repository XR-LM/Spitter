package spitter.dao;


import spitter.pojo.Spitter;

public interface SpitterRepository {
	/**
	 * 保存用户
	 * @param spitter
	 */
	void SaveUser(Spitter spitter);
	/**
	 * 根据用户名查询用户
	 * @param username
	 * @return
	 */
	Spitter findByUsername(String username);
}
