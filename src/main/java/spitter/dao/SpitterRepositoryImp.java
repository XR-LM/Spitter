package spitter.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import spitter.pojo.Spitter;

@Repository
public class SpitterRepositoryImp implements SpitterRepository {
	private List<Spitter> spitters = new ArrayList<Spitter>();

	@Override
	public void SaveUser(Spitter spitter) {
		// TODO 自动生成的方法存根
		spitters.add(spitter);
	}

	@Override
	public Spitter findByUsername(String username) {
		// TODO 自动生成的方法存根
		for (Spitter spitter : spitters) {
			if(spitter.getUsername().equals(username)) {
				return spitter;
			}
		}
		
		return null;
	}
	
	

}
