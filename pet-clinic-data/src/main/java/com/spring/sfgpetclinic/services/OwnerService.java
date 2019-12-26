package com.spring.sfgpetclinic.services;

import java.util.List;
import java.util.Set;

import com.spring.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	
    Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}
