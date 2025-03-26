package org.example.service;

import org.example.dao.ITxlDao;
import org.example.entity.Txl_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service

//@Component

public class TxlService implements ITxlService {
    @Autowired
    ITxlDao txlDao;
    @Override
    public  String add(Txl_Entity txlEntity){
        txlDao.addDao(txlEntity);
        System.out.println("这是TxlService类");
        System.out.println("到service了");
        return "到service了";
    }
}
