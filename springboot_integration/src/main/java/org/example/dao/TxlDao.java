package org.example.dao;

import org.example.entity.Txl_Entity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository
@Component
public class TxlDao implements ITxlDao {
    @Override
    public String addDao(Txl_Entity txlEntity){
        System.out.println("到Dao层了");
        return txlEntity.getId()+"Dao层";
    }
}
