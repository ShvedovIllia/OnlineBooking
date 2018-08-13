package badm.courts.service;

import java.util.List;

import badm.courts.domain.CourtDTO;

public interface CourtService {

	void addCourt(CourtDTO courtDTO);
	
	CourtDTO getCourtById(Long id);
	
	List<CourtDTO> getAllCourts();
	
	void deleteCourtById(Long id);
	
	void updateCourtById(Long id);
}
