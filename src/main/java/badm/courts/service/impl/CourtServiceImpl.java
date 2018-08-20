package badm.courts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import badm.courts.domain.CourtDTO;
import badm.courts.entity.Court;
import badm.courts.repository.CourtRepository;
import badm.courts.service.CourtService;
import badm.courts.service.utils.ObjectMapperUtils;

@Service

public class CourtServiceImpl implements CourtService {

	@Autowired
	private CourtRepository courtRepository;

	@Autowired
	private ObjectMapperUtils modelMapper;

	@Override
	public void addCourt(CourtDTO courtDTO) {
		courtRepository.save(modelMapper.map(courtDTO, Court.class));
	}

	@Override
	public CourtDTO getCourtById(Long id) {
		return modelMapper.map(courtRepository.findById(id), CourtDTO.class);
	}

	@Override
	public List<CourtDTO> getAllCourts() {
		return modelMapper.mapAll(courtRepository.findAll(), CourtDTO.class);
	}

	@Override
	public void deleteCourtById(Long id) {
		courtRepository.deleteById(id);
	}

}
