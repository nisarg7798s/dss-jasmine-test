package com.nisarg.controller;


import com.nisarg.service.AvailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/avails")
public class AvailsController {

    @Autowired
    AvailsService availsService;

    @PostMapping(path = "/adrights")
    public void insertAdRights(@RequestBody com.movielabs.schema.avails.v2_3.avails.AvailList availsXml) {
      availsService.extractAdRights(availsXml);
    }
}
