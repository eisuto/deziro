package com.wxww.deziro.service.impl;

import com.wxww.deziro.dao.DeziroDAO;
import com.wxww.deziro.domain.Deziro;
import com.wxww.deziro.service.DeziroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author eisuto
 * @date 2022/1/4 15:01
 */
@Service
public class DeziroServiceImpl implements DeziroService {


    @Autowired
    DeziroDAO deziroDAO;

    @Override
    public List<Deziro> find(Deziro vo) {
        if (vo.getName() == null) {
            return deziroDAO.findAllOrderByIdDesc();
        }
        return deziroDAO.findAllByNameContaining(vo.getName());
    }


    @Override
    public Deziro add(Deziro vo) {
        return deziroDAO.save(vo);
    }

    @Override
    public Deziro update(Deziro vo) {
        return deziroDAO.save(vo);
    }




    @Override
    public void delete(int id) {
        deziroDAO.deleteById(id);
    }
}
