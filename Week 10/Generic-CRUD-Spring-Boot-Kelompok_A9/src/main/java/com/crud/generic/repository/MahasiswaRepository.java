package com.crud.generic.repository;

import org.springframework.stereotype.Repository;

import com.crud.generic.entity.Mahasiswa;
import com.crud.generic.repository.generic.GenericRepository;

@Repository
public interface MahasiswaRepository extends GenericRepository<Mahasiswa>{

}
