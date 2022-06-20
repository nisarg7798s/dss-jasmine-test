package com.nisarg.service;

import com.movielabs.schema.avails.v2_3.avails.AvailList;
import com.nisarg.database.tables.daos.AdrightsDao;
import com.nisarg.database.tables.pojos.Adrights;
import com.nisarg.entity.AdRights;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class AvailsService {

    @Autowired
    AdrightsDao adrightsDao;

    public void extractAdRights(com.movielabs.schema.avails.v2_3.avails.AvailList availList) {
        List<AvailList.Avail.Transaction.Term> termList = availList.getAvail().getTransaction().getTerm().stream().filter(term -> term.getTermName().equalsIgnoreCase("AdRights")).collect(Collectors.toList());

        log.info(termList.get(0).getType());
        log.info(termList.get(0).getText());
        log.info(availList.getAvail().getALID());

        AdRights adRights = new AdRights();

        adRights.setAlId(availList.getAvail().getALID());
        adRights.setType(termList.get(0).getType());
        adRights.setText(termList.get(0).getText());

        saveAdRights(adRights);

    }

    private void saveAdRights(AdRights adRights) {
//        adRightsRepository.save(adRights);

        adrightsDao.insert((Collection<Adrights>) adRights);

    }
}
