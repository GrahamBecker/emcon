package emcon.services.Impl;

import emcon.domain.PreferredContactMethod;
import emcon.repository.PreferredContactMethodRepository;
import emcon.services.PreferredContactMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by graham on 2015/05/17.
 */
@Service
public class PreferredContactMethodServiceImpl implements PreferredContactMethodService{

    @Autowired
    PreferredContactMethodRepository repository;
    public List<PreferredContactMethod> getPreferredContactMethod() {

        List<PreferredContactMethod> allPreferredContactMethods = new ArrayList<PreferredContactMethod>();

        Iterable<PreferredContactMethod> preferredContactMethods = repository.findAll();
        for (PreferredContactMethod preferredContactMethod : preferredContactMethods) {
            allPreferredContactMethods.add(preferredContactMethod);
        }
        return allPreferredContactMethods;
    }
}
