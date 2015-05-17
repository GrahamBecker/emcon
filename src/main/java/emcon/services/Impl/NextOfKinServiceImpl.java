package emcon.services.Impl;

import emcon.domain.NextOfKin;
import emcon.repository.NextOfKinRepository;
import emcon.services.NextOfKinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by graham on 2015/05/17.
 */
@Service
public class NextOfKinServiceImpl implements NextOfKinService{

    @Autowired
    NextOfKinRepository repository;
    public List<NextOfKin> getNextOfKin() {

        List<NextOfKin> allNextOfKin = new ArrayList<NextOfKin>();

        Iterable<NextOfKin> nextOfKins = repository.findAll();
        for (NextOfKin nextOfKin : nextOfKins) {
            allNextOfKin.add(nextOfKin);
        }
        return allNextOfKin;
    }
}
