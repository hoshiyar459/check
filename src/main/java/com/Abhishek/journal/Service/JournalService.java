package com.Abhishek.journal.Service;

import com.Abhishek.journal.Entity.Journal;
import com.Abhishek.journal.repo.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.List;

@Component
public class JournalService {

    @Autowired
    private Repository repo ;

    public List<Journal> getAll(){
         return repo.findAll();
    }

    public Journal CreateEntry(Journal Journal){
        return repo.save(Journal);
    }


}
