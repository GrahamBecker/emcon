package emcon.services.Impl;

import emcon.domain.UniqueIdentifiers;
import emcon.repository.UniqueIdentifiersRepository;
import emcon.services.UniqueIdentifiersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by graham on 2015/05/17.
 */
@Service
public class UniqueIdentifiersServiceImpl implements UniqueIdentifiersService{

    @Autowired
    UniqueIdentifiersRepository repository;
    public List<UniqueIdentifiers> getUniqueIdentifiers() {

        List<UniqueIdentifiers> allUniqueIdentifiers = new ArrayList<UniqueIdentifiers>();

        Iterable<UniqueIdentifiers> uniqueIdentifierses = repository.findAll();
        for (UniqueIdentifiers uniqueIdentifiers : uniqueIdentifierses) {
            allUniqueIdentifiers.add(uniqueIdentifiers);
        }
        return allUniqueIdentifiers;
    }
}
