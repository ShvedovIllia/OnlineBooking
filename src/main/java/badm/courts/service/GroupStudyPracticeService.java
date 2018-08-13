package badm.courts.service;

import java.util.List;

import badm.courts.domain.GroupStudyPracticeDTO;

public interface GroupStudyPracticeService {

	void addGsp(GroupStudyPracticeDTO dto);

	GroupStudyPracticeDTO getGspById(Long id);

	List<GroupStudyPracticeDTO> getAllGsp();

	void deleteGspById(Long id);

	void updateGspById(Long id);

}
