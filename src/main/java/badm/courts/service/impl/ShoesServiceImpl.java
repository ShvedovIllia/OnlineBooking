package badm.courts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import badm.courts.domain.ShoesDTO;
import badm.courts.entity.Shoes;
import badm.courts.repository.ShoesRepository;
import badm.courts.service.ShoesService;
import badm.courts.service.utils.ObjectMapperUtils;

@Service

public class ShoesServiceImpl implements ShoesService {

	@Autowired
	private ShoesRepository shoesRepository;

	@Autowired
	private ObjectMapperUtils modelMapper;

	@Override
	public void addShoes(ShoesDTO dto) {
		shoesRepository.save(modelMapper.map(dto, Shoes.class));
	}

	@Override
	public ShoesDTO getShoesById(Long id) {
		return modelMapper.map(shoesRepository.findById(id), ShoesDTO.class);
	}

	@Override
	public List<ShoesDTO> getAllShoes() {
		return modelMapper.mapAll(shoesRepository.findAll(), ShoesDTO.class);
	}

	@Override
	public void deleteShoesById(Long id) {
		shoesRepository.deleteById(id);
	}
}
