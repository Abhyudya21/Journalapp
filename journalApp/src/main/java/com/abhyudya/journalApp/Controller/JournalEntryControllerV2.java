package com.abhyudya.journalApp.Controller;
import com.abhyudya.journalApp.Entity.JournalEntry;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    @RestController
    @RequestMapping("/journal")
    public class JournalEntryControllerV2{

        @GetMapping
        public List<JournalEntry> getAll()
        {
            return null;
        }
        @PostMapping
        public boolean JournalEntry (@RequestBody JournalEntry journalEntry)
        {
            return true;

        }

        @GetMapping("id/{myID}")
        public JournalEntry getJournalEntry(@PathVariable long myID)
        {
            return null;

        }
        @DeleteMapping("id/{myID}")
        public JournalEntry deleteJournalEntry(@PathVariable long myID) {
            return null;

        }
        @PutMapping("id/{myID}")
        public JournalEntry updateJournalEntry(@PathVariable long myID, @RequestBody JournalEntry journalEntry) {
            return null;

        }
    }


