package in.divyanshgarg.leadflow.controller;

import in.divyanshgarg.leadflow.entity.Lead;
import in.divyanshgarg.leadflow.service.LeadService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leads")
@RequiredArgsConstructor
public class LeadController {

    @Autowired
    private LeadService leadService;

    @GetMapping
    public List<Lead> getAllLeads() {
        return leadService.getAllLeads();
    }

    @PostMapping("/create")
    public ResponseEntity<?> createLead(@Valid @RequestBody Lead lead) {
        try {
            Lead createdLead = leadService.createLead(lead);
            return new ResponseEntity<>(createdLead, HttpStatus.CREATED);
        } catch (IllegalStateException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }

}
