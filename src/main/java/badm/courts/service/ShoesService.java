package badm.courts.service;

import java.util.List;

import badm.courts.domain.ShoesDTO;

public interface ShoesService {

	void addShoes(ShoesDTO dto);

	ShoesDTO getShoesById(Long id);

	List<ShoesDTO> getAllShoes();

	void deleteShoesById(Long id);

	void updateShoesById(Long id);

}
