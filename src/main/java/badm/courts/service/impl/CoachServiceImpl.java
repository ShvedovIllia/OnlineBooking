package badm.courts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import badm.courts.domain.CoachDTO;
import badm.courts.repository.CoachRepository;
import badm.courts.service.CoachService;

@Service

public class CoachServiceImpl implements CoachService {

	@Autowired
	private CoachRepository coachRepository;

	@Override
	public void addCoach(CoachDTO coachDTO) {

	}

	@Override
	public CoachDTO findCoachById(Long id) {
		return null;
	}

	@Override
	public List<CoachDTO> findAllCoaches() {
		return null;
	}

	@Override
	public void deleteCoachById(Long id) {

	}

	@Override
	public void updateCoachById(Long id) {

	}

}
