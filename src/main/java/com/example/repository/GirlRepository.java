package com.example.repository;

import com.domain.Girl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 数据仓库获取
 *
 * @author hongcj
 * @version V1.0
 * @since 2017-06-22 13:54
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {
    public List<Girl> findByAge(Integer age);
}
