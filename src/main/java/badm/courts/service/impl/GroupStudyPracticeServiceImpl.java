package badm.courts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import badm.courts.domain.GroupStudyPracticeDTO;
import badm.courts.entity.GroupStudyPractice;
import badm.courts.repository.GroupStudyPracticeRepository;
import badm.courts.service.GroupStudyPracticeService;
import badm.courts.service.utils.ObjectMapperUtils;

@Service

public class GroupStudyPracticeServiceImpl implements GroupStudyPracticeService {

	@Autowired
	private GroupStudyPracticeRepository gspRepository;

	@Autowired
	private ObjectMapperUtils modelMapper;

	@Override
	public void addGsp(GroupStudyPracticeDTO dto) {
		gspRepository.save(modelMapper.map(dto, GroupStudyPractice.class));
	}

	@Override
	public GroupStudyPracticeDTO getGspById(Long id) {
		return modelMapper.map(gspRepository.findById(id), GroupStudyPracticeDTO.class);
	}

	@Override
	public List<GroupStudyPracticeDTO> getAllGsp() {
		return modelMapper.mapAll(gspRepository.findAll(), GroupStudyPracticeDTO.class);
	}

	@Override
	public void deleteGspById(Long id) {
		gspRepository.deleteById(id);
	}

}
