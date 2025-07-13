package com.abhyudya.journalApp.Service;

import com.abhyudya.journalApp.Entity.JournalEntry;
import com.abhyudya.journalApp.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;
    public void saveEntry(JournalEntry journalEntry)
    {

        journalEntryRepository.save(journalEntry);
    }

    public Optional <JournalEntry> findById(ObjectId id)
    {
 return journalEntryRepository.findById(id);
    }
    public Optional<JournalEntry> delete(ObjectId id)
    {
         journalEntryRepository.deleteById(id);
    }

}
