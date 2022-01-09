package com.wxww.deziro.dao;

import com.wxww.deziro.domain.Deziro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author eisuto
 * @date 2022/1/4 14:59
 */
public interface DeziroDAO extends JpaRepository<Deziro, Integer> , JpaSpecificationExecutor<Deziro> {
    /**
     * 模糊搜索名称
     * @return
     */
    List<Deziro> findAllByNameContaining(String name);

    /**
     * 排序
     * @return
     */
    @Query(value = "select d from Deziro d order by d.createDate desc ")
    List<Deziro> findAllOrderByCreateDateDesc();

    @Query(value = "select d from Deziro d order by d.id desc ")
    List<Deziro> findAllOrderByIdDesc();
}
