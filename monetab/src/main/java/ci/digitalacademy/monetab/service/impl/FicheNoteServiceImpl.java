package ci.digitalacademy.monetab.service.impl;

import ci.digitalacademy.monetab.models.FicheNote;
import ci.digitalacademy.monetab.repositories.FicheNoteRepository;
import ci.digitalacademy.monetab.service.FicheNoteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class FicheNoteServiceImpl implements FicheNoteService {

    private final FicheNoteRepository ficheNoteRepository;

    @Override
    public FicheNote save(FicheNote ficheNote) {
        log.debug("Saving address: {}", ficheNote);
        return ficheNoteRepository.save(ficheNote);
    }

    @Override
    public FicheNote update(FicheNote ficheNote) {
        return ficheNoteRepository.save(ficheNote);
    }

    @Override
    public Optional<FicheNote> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public List<FicheNote> findAll() {
        return ficheNoteRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {

    }

//    @ManyToOne


}
