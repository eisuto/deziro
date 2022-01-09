package com.wxww.deziro.service;

import com.wxww.deziro.domain.Deziro;

import java.util.List;

/**
 * @author eisuto
 * @date 2022/1/4 14:56
 */
public interface DeziroService {
    List<Deziro> find(Deziro vo);
    Deziro add(Deziro vo);
    Deziro update(Deziro vo);
    void delete(int id);
}
