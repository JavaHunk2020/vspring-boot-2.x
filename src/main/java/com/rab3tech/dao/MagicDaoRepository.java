package com.rab3tech.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rab3tech.dao.entity.ProfileEntity;

public interface MagicDaoRepository extends JpaRepository<ProfileEntity, String> {

}
