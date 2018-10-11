package badm.courts.service.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import badm.courts.domain.CoachDTO;
import badm.courts.entity.Coach;
import badm.courts.exception.CoachNotFoundException;
import badm.courts.repository.CoachRepository;
import badm.courts.service.CoachService;
import badm.courts.service.utils.ObjectMapperUtils;

@Service

public class CoachServiceImpl implements CoachService {

	@Autowired
	private CoachRepository coachRepository;
	
	@Autowired
	private ObjectMapperUtils modelMapper;

	@Override
	public void addCoach(CoachDTO coachDTO) {
		coachRepository.save(modelMapper.map(coachDTO, Coach.class));
	}

	@Override
	public CoachDTO findCoachById(Long id) {
		CoachDTO coachDTO = modelMapper.map(coachRepository.findById(id).get(), CoachDTO.class);
		if(Objects.isNull(coachDTO)) {
			throw new CoachNotFoundException(id, "Coach with id {} not found"); 
		}
		return coachDTO;
	}

	@Override
	public List<CoachDTO> findAllCoaches() {
		return modelMapper.mapAll(coachRepository.findAll(), CoachDTO.class);
	}

	@Override
	public void deleteCoachById(Long id) {
		coachRepository.deleteById(id);
	}
}
