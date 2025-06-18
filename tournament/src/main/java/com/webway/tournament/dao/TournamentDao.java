package com.webway.tournament.dao;

import com.webway.tournament.domain.Tournament;

public interface TournamentDao {
    public Long createTournament(Tournament tournament);

    public Tournament getTournament(Long id);
}
