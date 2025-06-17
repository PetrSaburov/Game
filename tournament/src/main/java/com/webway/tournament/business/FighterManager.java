package com.webway.tournament.business;

import com.webway.tournament.dao.FighterDao;
import com.webway.tournament.domain.Fighter;
import com.webway.tournament.dto.FighterDto;
import com.webway.tournament.mapper.TournamentMapper;

public class FighterManager {

    private FighterDao fighterDao;
    private TournamentMapper mapper;

    public void setMapper(TournamentMapper mapper) {
        this.mapper = mapper;
    }

    public void setFighterDao(FighterDao fighterDao) {
        this.fighterDao = fighterDao;
    }

    public Long createFighter (FighterDto dto){
        Fighter f = mapper.createFighterFromDto(dto);
        return fighterDao.createFighter(f);
    }
}
