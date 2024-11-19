package com.Abhishek.journal.Controller;

import com.Abhishek.journal.Entity.Journal;
import com.Abhishek.journal.Service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("journal")
public class JournalEntryController {

    @Autowired
    private JournalService journalService;

    @GetMapping
    public ResponseEntity<List<Journal>> getAll(){
        try{
            List<Journal> all = journalService.getAll();
            return new ResponseEntity<>(all , HttpStatus.OK);
        }catch(Exception e ){
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public Journal CreateUser(@RequestBody Journal journalEntry)  {
        try{
           return  journalService.CreateEntry(journalEntry);
        }catch(Exception e ){
            System.out.println("error occured");
        }
        return null ;
    }


}
