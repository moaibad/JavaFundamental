package com.crud.generic.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.generic.controller.MahasiswaController;
import com.crud.generic.controller.generic.impl.ControllerGenericImpl;
import com.crud.generic.entity.Mahasiswa;

@RestController
@RequestMapping(path = "/mahasiswa")
public class MahasiswaControllerImpl extends ControllerGenericImpl<Mahasiswa> implements MahasiswaController{
	
}
