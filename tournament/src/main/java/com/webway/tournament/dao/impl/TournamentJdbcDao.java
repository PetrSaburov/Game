package com.webway.tournament.dao.impl;

import com.webway.tournament.dao.TournamentDao;
import com.webway.tournament.domain.Tournament;

public class TournamentJdbcDao implements TournamentDao {


    @Override
    public Long createTournament(Tournament tournament) {
        System.out.println("New Tournament is saved!");
        return 0L;
    }

    @Override
    public Tournament getTournament(Long id) {
        return new Tournament();
    }
}
