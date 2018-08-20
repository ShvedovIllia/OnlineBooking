package badm.courts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import badm.courts.domain.WaterDTO;
import badm.courts.domain.filter.SimpleFilter;
import badm.courts.entity.Water;
import badm.courts.repository.WaterRepository;
import badm.courts.service.WaterService;
import badm.courts.service.utils.ObjectMapperUtils;

@Service

public class WaterServiceImpl implements WaterService {

	@Autowired
	private WaterRepository waterRepository;
	
	@Autowired
	private ObjectMapperUtils modelMapper;
	
	@Override
	public void addItem(WaterDTO waterDTO) {
		waterRepository.save(modelMapper.map(waterDTO, Water.class));
	}

	@Override
	public List<WaterDTO> getAllWater() {
		return modelMapper.mapAll(waterRepository.findAll(), WaterDTO.class);
	}

	@Override
	public void deleteWaterById(Long id) {
		waterRepository.deleteById(id);
	}

	@Override
	public List<WaterDTO> findWaterByTitle(SimpleFilter filter) {
		return null;
	}

	@Override
	public WaterDTO getWaterById(Long id) {
		return modelMapper.map(waterRepository.findById(id), WaterDTO.class);
	}

}
