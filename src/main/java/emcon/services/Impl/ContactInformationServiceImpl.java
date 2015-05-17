package emcon.services.Impl;

import com.sun.corba.se.pept.transport.ContactInfo;
import emcon.conf.factory.ContactInformationFactory;
import emcon.domain.ContactInformation;
import emcon.repository.ContactInformationRepository;
import emcon.services.ContactInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by graham on 2015/05/17.
 */
@Service
public class ContactInformationServiceImpl implements ContactInformationService {

    @Autowired
    ContactInformationRepository repository;
    public List<ContactInformation> getContactInformation() {

        List<ContactInformation> allContactInformation = new ArrayList<ContactInformation>();

        Iterable<ContactInformation> cellNumbers = repository.findAll();

        for (ContactInformation cellNumber : cellNumbers) {
            allContactInformation.add(cellNumber);
        }

        return allContactInformation;

    }
}

