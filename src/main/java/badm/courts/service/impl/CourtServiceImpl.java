package badm.courts.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import badm.courts.domain.CourtDTO;
import badm.courts.service.CourtService;

@Service

public class CourtServiceImpl implements CourtService {

	@Override
	public void addCourt(CourtDTO courtDTO) {

	}

	@Override
	public CourtDTO getCourtById(Long id) {
		return null;
	}

	@Override
	public List<CourtDTO> getAllCourts() {
		return null;
	}

	@Override
	public void deleteCourtById(Long id) {

	}

	@Override
	public void updateCourtById(Long id) {

	}

}
