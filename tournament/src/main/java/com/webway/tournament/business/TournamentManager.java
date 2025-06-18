package com.webway.tournament.business;

import com.webway.tournament.dao.TournamentDao;
import com.webway.tournament.domain.Tournament;
import com.webway.tournament.dto.TournamentDto;
import com.webway.tournament.mapper.TournamentMapper;

public class TournamentManager {

    private TournamentDao tournamentDao;
    private TournamentMapper mapper;

    public void setTournamentDao(TournamentDao tournamentDao) {
        this.tournamentDao = tournamentDao;
    }

    public void setMapper(TournamentMapper mapper) {
        this.mapper = mapper;
    }

    public TournamentDto createTournament(TournamentDto tourDto) {
        Tournament t = mapper.createTournamentFromDto(tourDto);
        Long id = tournamentDao.createTournament(t);
        t = tournamentDao.getTournament(id);
        return mapper.createDtoFromTournament(t);
//        tourDto.setTourId(id);
//        return tourDto;
    }

    public TournamentDto findTournament(Long id) {
        Tournament t = tournamentDao.getTournament(id);
        return mapper.createDtoFromTournament(t);
    }


}
