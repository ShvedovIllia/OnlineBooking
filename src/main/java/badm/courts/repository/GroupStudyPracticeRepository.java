package badm.courts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import badm.courts.entity.GroupStudyPractice;

@Repository

public interface GroupStudyPracticeRepository
		extends JpaRepository<GroupStudyPractice, Long>, JpaSpecificationExecutor<GroupStudyPractice> {

}
