package badm.courts.service;

import java.util.List;

import badm.courts.domain.GroupPlayingPracticeDTO;

public interface GroupPlayingPracticeService {

	void addGPP(GroupPlayingPracticeDTO dto);

	GroupPlayingPracticeDTO getGppById(Long id);

	List<GroupPlayingPracticeDTO> getAllGpp();

	void deleteGpp(Long id);

}
