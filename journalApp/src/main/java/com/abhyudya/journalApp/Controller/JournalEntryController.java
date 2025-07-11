//package com.abhyudya.journalApp.Controller;
//
//import com.abhyudya.journalApp.Entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//    @RestController
//    @RequestMapping("/_journal")
//    public class JournalEntryController {
//        public Map<Long,JournalEntry > journalEntries= new HashMap<>();
//
//        @GetMapping
//        public List<JournalEntry> getAll()
//        {
//            return new ArrayList<>( journalEntries.values());
//        }
//        @PostMapping
//        public boolean JournalEntry (@RequestBody JournalEntry journalEntry)
//        {
//            if(journalEntry.getId() == 0)
//                System.out.println("id is 0");
//            journalEntries.put(journalEntry.getId(), journalEntry);
//            return true;
//        }
//
//        @GetMapping("id/{myID}")
//        public JournalEntry getJournalEntry(@PathVariable long myID)
//        {
//            return journalEntries.get(myID);
//        }
//        @DeleteMapping("id/{myID}")
//        public JournalEntry deleteJournalEntry(@PathVariable long myID) {
//            return  journalEntries.remove(myID);
//        }
//        @PutMapping("id/{myID}")
//        public JournalEntry updateJournalEntry(@PathVariable long myID, @RequestBody JournalEntry journalEntry) {
//            return journalEntries.put(myID, journalEntry);
//        }
//    }