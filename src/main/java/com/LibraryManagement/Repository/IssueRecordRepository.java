package com.LibraryManagement.Repository;

import com.LibraryManagement.Entity.IssueRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRecordRepository extends JpaRepository<IssueRecord ,Long> {

}
