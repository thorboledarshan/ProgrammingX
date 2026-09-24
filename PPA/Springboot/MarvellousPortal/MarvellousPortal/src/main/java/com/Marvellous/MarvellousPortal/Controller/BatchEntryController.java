package com.Marvellous.MarvellousPortal.Controller;

import com.Marvellous.MarvellousPortal.Entity.BatchEntry;
import com.Marvellous.MarvellousPortal.Repository.BatchEntryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/batches")
public class BatchEntryController
{
    @Autowired
    private BatchEntryRepository repository;

    @GetMapping
    public List<BatchEntry> getAll()
    {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public BatchEntry getBatchById(@PathVariable Long id)
    {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public String createEntry(@RequestBody BatchEntry myentry)
    {
        repository.save(myentry);
        return "Data inserted successfully";
    }

    @DeleteMapping("/id/{myid}")
    public void deleteEntryById(@PathVariable long myid)
    {
        repository.deleteById(myid);
    }

    @PutMapping("/id/{myid}")
    public void updateEntryById(@PathVariable long myid,
                                @RequestBody BatchEntry myentry)
    {
        myentry.setId(myid);
        repository.save(myentry);       //Make changes
    }
}