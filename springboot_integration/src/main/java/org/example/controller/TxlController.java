package org.example.controller;

import jakarta.annotation.Resource;
import org.example.entity.Txl_Entity;
import org.example.service.ITxlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Component

public class TxlController {
    @Autowired
//    @Resource(name = "Txl2Service")
    ITxlService txlService;
    @RequestMapping("/txladd")
    public String txladd(Txl_Entity txlEntity) {
        System.out.println(txlEntity.toString());
        txlService.add(txlEntity);
        System.out.println("到controller了");
        return "到controller了";
    }
}
