package com.spring.sfgpetclinic.services.map;

import java.util.List;
import java.util.Set;

import com.spring.sfgpetclinic.model.Owner;
import com.spring.sfgpetclinic.services.OwnerService;
import com.sun.xml.bind.v2.model.core.ID;

public class OwnerMapService<T> extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		return super.save(object);
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return this.findAll().stream().filter(owner -> owner.getLastName().equalsIgnoreCase(lastName)).findFirst()
				.orElse(null);
	}

	@Override
	public List<Owner> findAllByLastNameLike(String lastName) {

		// todo - impl
		return null;
	}
}
