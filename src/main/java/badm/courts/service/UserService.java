package badm.courts.service;

import java.util.List;

import badm.courts.domain.UserDTO;

public interface UserService {

	void addUser(UserDTO userDTO);

	UserDTO findUserById(Long id);

	List<UserDTO> findAllUsers();

	void deleteUserById(Long id);

	void updateUserById(Long id);
}
