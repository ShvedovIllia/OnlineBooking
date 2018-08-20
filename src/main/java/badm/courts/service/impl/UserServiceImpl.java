package badm.courts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import badm.courts.domain.UserDTO;
import badm.courts.entity.User;
import badm.courts.repository.UserRepository;
import badm.courts.service.UserService;
import badm.courts.service.utils.ObjectMapperUtils;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ObjectMapperUtils modelMapper;
	
	@Override
	public void addUser(UserDTO userDTO) {
		userRepository.save(modelMapper.map(userDTO, User.class));
	}

	@Override
	public UserDTO findUserById(Long id) {
		return modelMapper.map(userRepository.findById(id), UserDTO.class);
	}

	@Override
	public List<UserDTO> findAllUsers() {
		return modelMapper.mapAll(userRepository.findAll(), UserDTO.class);
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}

}
