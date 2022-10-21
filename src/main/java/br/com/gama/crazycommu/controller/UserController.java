package br.com.gama.crazycommu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.gama.crazycommu.dto.UserDTO;
import br.com.gama.crazycommu.dto.VeiculoDTO;
import br.com.gama.crazycommu.model.Veiculo;

@RestController
public class UserController {
	public static List<UserDTO> users = new ArrayList<UserDTO>();
	public static List<VeiculoDTO> veiculos = new ArrayList<VeiculoDTO>();
	
	
	
	@PostConstruct
	public void initiateList() {
		UserDTO userDTO=new UserDTO();
		userDTO.setId(1);
		userDTO.setNome("Zé");
		userDTO.setLogin("ze");
		
		veiculos.add(new VeiculoDTO("Fuca", "Fusca", "automóvel"));
		
		userDTO.setVeiculos(veiculos);
		
		veiculos.clear();
		
		UserDTO userDTO2=new UserDTO();
		userDTO2.setId(2);
		userDTO2.setNome("João");
		userDTO2.setLogin("jao");
		
		veiculos.add(new VeiculoDTO("Terror", "Opala", "automóvel"));
		
		userDTO2.setVeiculos(veiculos);
		
		veiculos.clear();
		
		UserDTO userDTO3=new UserDTO();
		userDTO3.setId(3);
		userDTO3.setNome("Antonio");
		userDTO3.setLogin("Tonho");
		
		veiculos.add(new VeiculoDTO("Jane", "CG", "moto"));
		
		userDTO3.setVeiculos(veiculos);
		
		veiculos.clear();
		
		
		users.add(userDTO);
		users.add(userDTO2);
		users.add(userDTO3);
		
	}
	
	@GetMapping("/")
	public String getMensagem() {
		return "O Spring boot está rodando";
	}
	
	@GetMapping("/users")
	public List<UserDTO> getUsers(){
		return users;
	}
	
	@GetMapping("/users/{id}")
	public UserDTO getUsersFiltro(@PathVariable long id) {
		for(UserDTO userFilter: users) {
			if(userFilter.getId()==(id)) {
				return userFilter;
			}
		}
		return null;
	}
	
	
}
