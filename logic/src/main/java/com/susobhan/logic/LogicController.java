package com.susobhan.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LogicController {
    @Autowired
    private LogicService service;

    @GetMapping("/logic")
    public List<Logic> list(){
        return  service.listAll();
    }

    @GetMapping("/logic/{id}")
    public ResponseEntity<Logic> get(@PathVariable Integer id){
        Logic logic = service.get(id);
        return new ResponseEntity<Logic>(logic, HttpStatus.OK);
    }

    @PostMapping("/logic")
    public void add(@RequestBody Logic logic){
        service.save(logic);
    }


    @PutMapping("/logic/{id}")
    public ResponseEntity<?> update(@RequestBody Logic logic,@PathVariable Integer id){
        try{
            Logic existLogic = service.get(id);
            service.save(logic);
            return new ResponseEntity<Logic>(logic,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/logic/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
