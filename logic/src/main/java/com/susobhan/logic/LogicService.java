package com.susobhan.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LogicService {
    @Autowired
    private LogicRepository repository;

    public List<Logic> listAll(){
        return repository.findAll();
    }

    public  Logic get(Integer id){
        return  repository.findById(id).get();
    }

    public void save (Logic logic){
        repository.save(logic);
    }

    public  void delete(Integer id){
        repository.deleteById(id);
    }

}
