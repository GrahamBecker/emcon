package emcon.services.Impl;

import emcon.domain.MedAid;
import emcon.repository.MedAidRepository;
import emcon.services.MedAidTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by graham on 2015/05/17.
 */
@Service
public class MedAidServiceImpl implements MedAidTypeService {

    @Autowired
    MedAidRepository repository;
    public List<MedAid> getMedAid() {

        List<MedAid> allMedAids = new ArrayList<MedAid>();

        Iterable<MedAid> medAids = repository.findAll();
        for (MedAid medAid : medAids) {
            allMedAids.add(medAid);
        }
        return allMedAids;
    }
}
