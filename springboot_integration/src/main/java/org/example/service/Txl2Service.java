package org.example.service;

import org.example.dao.ITxlDao;
import org.example.entity.Txl_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary

public class Txl2Service implements ITxlService {
    @Autowired
    ITxlDao txlDao;
    @Override
    public  String add(Txl_Entity txlEntity){
        txlDao.addDao(txlEntity);
        System.out.println("这是Txl2Service类");
        System.out.println("到service了");
        return "到service了";
    }
}
