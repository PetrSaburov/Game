package com.webway.tournament.web;

import com.webway.tournament.business.FighterManager;
import com.webway.tournament.dao.FighterDao;
import com.webway.tournament.dao.impl.FighterJdbcDao;
import com.webway.tournament.dto.FighterDto;
import com.webway.tournament.mapper.TournamentMapper;

import static org.junit.jupiter.api.Assertions.*;

class FighterControllerTest {

    @org.junit.jupiter.api.Test
    public void createFighter() {
        FighterController contr = new FighterController();
        FighterManager man = new FighterManager();
        FighterDao dao = new FighterJdbcDao();
        TournamentMapper tm = new TournamentMapper();

        man.setFighterDao(dao);
        man.setMapper(tm);
        contr.setManager(man);

        FighterDto dto = new FighterDto();
        dto.setFighterName("Gingerbeard");
        contr.createFighter(dto);
        System.out.println("Create fighter method passed");
    }
}