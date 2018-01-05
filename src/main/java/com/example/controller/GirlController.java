package com.example.controller;

import com.domain.Girl;
import com.example.repository.GirlRepository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 对girl进行操作
 */
@RestController
public class GirlController {

    private final static Logger logger = LoggerFactory.getLogger(GirlController.class);
    @Autowired
    private GirlRepository girlRespository;

    /**
     * 获取所有的girl
     *
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girls() {
        logger.info("1111");
        return girlRespository.findAll();
    }

}
