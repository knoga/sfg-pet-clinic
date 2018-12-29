package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long aLong);

    Vet save(Vet s);

    Set<Vet> findAll();
}
