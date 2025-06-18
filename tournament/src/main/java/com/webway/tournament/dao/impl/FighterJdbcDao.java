package com.webway.tournament.dao.impl;

import com.webway.tournament.dao.FighterDao;
import com.webway.tournament.domain.Fighter;

public class FighterJdbcDao implements FighterDao {


    @Override
    public Long createFighter(Fighter fighter) {
        System.out.println("New Fighter is saved!");
        return 0L;
    }
}
