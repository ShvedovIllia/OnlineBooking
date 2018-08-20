package badm.courts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import badm.courts.domain.EquipmentDTO;
import badm.courts.entity.Equipment;
import badm.courts.repository.EquipmentRepository;
import badm.courts.service.EquipmentService;
import badm.courts.service.utils.ObjectMapperUtils;

@Service

public class EquipmentServiceImpl implements EquipmentService {

	@Autowired
	private EquipmentRepository equipmentRepository;

	@Autowired
	private ObjectMapperUtils modelMapper;

	@Override
	public void addItem(EquipmentDTO dto) {
		equipmentRepository.save(modelMapper.map(dto, Equipment.class));
	}

	@Override
	public EquipmentDTO getEquipmentById(Long id) {
		return modelMapper.map(equipmentRepository.findById(id), EquipmentDTO.class);
	}

	@Override
	public List<EquipmentDTO> getAllEquipments() {
		return modelMapper.mapAll(equipmentRepository.findAll(), EquipmentDTO.class);
	}

	@Override
	public void deleteEquipment(Long id) {
		equipmentRepository.deleteById(id);
	}

}
