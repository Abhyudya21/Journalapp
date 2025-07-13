package com.abhyudya.journalApp.Controller;
import com.abhyudya.journalApp.Entity.JournalEntry;
import com.abhyudya.journalApp.Service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    @RestController
    @RequestMapping("/journal")
    public class JournalEntryControllerV2{

        @Autowired
        private JournalEntryService journalEntryService;
        @GetMapping
        public List<JournalEntry> getAll()
        {

            return null;
        }
        @PostMapping
        public boolean JournalEntry (@RequestBody JournalEntry journalEntry)
        {
            journalEntry.setDate(java.time.LocalDateTime.now());
            journalEntryService.saveEntry(journalEntry);
            return true;

        }

        @GetMapping("id/{myID}")
        public JournalEntry getJournalEntry(@PathVariable ObjectId myID)
        {
            journalEntryService.findById(myID).orElse(null);
            return null;

        }
        @DeleteMapping("id/{myID}")
        public JournalEntry deleteJournalEntry(@PathVariable ObjectId myID) {
            return null;

        }
        @PutMapping("id/{myID}")
        public JournalEntry updateJournalEntry(@PathVariable ObjectId myID, @RequestBody JournalEntry journalEntry) {
            return null;

        }
    }


