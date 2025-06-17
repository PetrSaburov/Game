package com.webway.tournament.web;

import com.webway.tournament.business.FighterManager;
import com.webway.tournament.dto.FighterDto;

public class FighterController {


    private FighterManager manager;

    public void setManager(FighterManager manager) {
        this.manager = manager;
    }

    public Long createFighter(FighterDto dto){
        return manager.createFighter(dto);
    }

}
