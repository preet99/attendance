package com.employee.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.attendance.entity.AttendanceData;

public interface AttendanceRepository extends JpaRepository<AttendanceData, Long> {

}
