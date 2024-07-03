package com.project.schoolmanagment.repository.business;


import com.project.schoolmanagment.entity.concretes.business.Meet;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeetingRepository extends JpaRepository<Meet, Long> {
    List<Meet>findByStudentList_IdEquals(Long studentId);

    List<Meet>getByAdvisoryTeacher_IdEquals(Long id);

    Page<Meet> getByAdvisoryTeacher_IdEquals(Long id, Pageable pageable);

}
