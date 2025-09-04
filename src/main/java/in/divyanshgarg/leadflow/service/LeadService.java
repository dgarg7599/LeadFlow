package in.divyanshgarg.leadflow.service;

import in.divyanshgarg.leadflow.entity.Lead;
import in.divyanshgarg.leadflow.entity.Status;
import in.divyanshgarg.leadflow.repository.LeadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LeadService {

    @Autowired
    private LeadRepository leadRepository;

    public List<Lead> getAllLeads() {
        return leadRepository.findAll();
    }

    public Lead createLead(Lead newLead) {
        Optional<Lead> existingLead = leadRepository.findByEmail(newLead.getEmail());
        if (existingLead.isPresent()) {
            throw new IllegalStateException("Email already exists");
        }
        newLead.setStatus(Status.NEW);
        return leadRepository.save(newLead);
    }
}
