package badm.courts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import badm.courts.domain.CostDTO;
import badm.courts.entity.Cost;
import badm.courts.repository.CostRepository;
import badm.courts.service.CostService;
import badm.courts.service.utils.ObjectMapperUtils;

@Service

public class CostServiceImpl implements CostService {

	@Autowired
	private CostRepository costRepository;
	
	@Autowired
	private ObjectMapperUtils modelMapper;
	
	@Override
	public void createCost(CostDTO costDTO) {
		costRepository.save(modelMapper.map(costDTO, Cost.class));
	}

	@Override
	public CostDTO getCostById(Long id) {
		return modelMapper.map(costRepository.findById(id), CostDTO.class);
	}

	@Override
	public List<CostDTO> getAllCosts() {
		return modelMapper.mapAll(costRepository.findAll(), CostDTO.class);
	}

	@Override
	public void deleteCostById(Long id) {
		costRepository.deleteById(id);
	}

}
