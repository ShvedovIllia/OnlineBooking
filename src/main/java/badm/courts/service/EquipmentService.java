package badm.courts.service;

import java.util.List;

import badm.courts.domain.EquipmentDTO;

public interface EquipmentService {

	void addItem(EquipmentDTO dto);

	EquipmentDTO getEquipmentById(Long id);

	List<EquipmentDTO> getAllEquipments();

	void deleteEquipment();

	void updateEquipment();

}
