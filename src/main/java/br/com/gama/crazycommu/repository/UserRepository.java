package br.com.gama.crazycommu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gama.crazycommu.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findById(long id);
	List<User> queryByNomeLike(String nome);
	
}
