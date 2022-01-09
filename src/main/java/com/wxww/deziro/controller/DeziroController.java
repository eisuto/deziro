package com.wxww.deziro.controller;

import com.wxww.deziro.base.Result;
import com.wxww.deziro.domain.Deziro;
import com.wxww.deziro.service.DeziroService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author eisuto
 * @date 2022/1/4 14:56
 */
@RestController
@RequestMapping("deziro")
public class DeziroController {
    @Resource
    DeziroService deziroService;

    @GetMapping
    public Result find(Deziro vo) {
        return Result.success(deziroService.find(vo));
    }


    @PostMapping
    public Result add(@RequestBody Deziro vo) {
        return Result.success(deziroService.add(vo));
    }


    @PutMapping
    public Result update(@RequestBody Deziro vo) {
        return Result.success(deziroService.update(vo));
    }

    @DeleteMapping("/{id}")
    public Result del(@PathVariable Integer id) {
        deziroService.delete(id);
        return Result.success();
    }
}
