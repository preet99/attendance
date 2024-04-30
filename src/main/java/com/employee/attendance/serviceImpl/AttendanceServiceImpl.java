package com.employee.attendance.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.attendance.entity.AttendanceData;
import com.employee.attendance.repository.AttendanceRepository;
import com.employee.attendance.service.AttendanceService;

@Service
public class AttendanceServiceImpl implements AttendanceService {
	
	@Autowired
	private AttendanceRepository attendanceRepository;

	
	@Override
	public String saveAttendanceDetails(AttendanceData attendance) {
		// TODO Auto-generated method stub
		attendanceRepository.save(attendance);
		return "attendance is saved";
	}

	

}
