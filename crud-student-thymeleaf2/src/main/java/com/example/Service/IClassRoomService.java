package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.ClassRoomDto;

@Service
public interface IClassRoomService {
	@Autowired
	public List<ClassRoomDto> GetListClass();
}
