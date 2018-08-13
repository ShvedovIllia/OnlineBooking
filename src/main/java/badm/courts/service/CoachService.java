package badm.courts.service;

import java.util.List;

import badm.courts.domain.CoachDTO;

public interface CoachService {

	void addCoach(CoachDTO coachDTO);

	CoachDTO findCoachById(Long id);

	List<CoachDTO> findAllCoaches();

	void deleteCoachById(Long id);

	void updateCoachById(Long id);
}
