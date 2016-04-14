package org.meruvian.workshop.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PersonController {
	@Autowired
    private PersonRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public Page<Person> findAllPersons(Pageable pageable) {
        return repository.findAll(pageable);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public Person savePerson(@RequestBody Person person) {
        return repository.save(person);
    }
}
