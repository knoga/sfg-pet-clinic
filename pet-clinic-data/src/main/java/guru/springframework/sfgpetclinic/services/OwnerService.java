package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {


    Owner findByLastName(String lastName);

    Owner findById(Long aLong);

    Owner save(Owner s);

    Set<Owner> findAll();
}
