package com.elte.soulmate.registration.service.mapper;

import com.elte.soulmate.registration.domain.*;
import com.elte.soulmate.registration.service.dto.PersonDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Person} and its DTO {@link PersonDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PersonMapper extends EntityMapper<PersonDTO, Person> {}
