package com.webway.tournament.mapper;

import com.webway.tournament.domain.Fighter;
import com.webway.tournament.domain.Tournament;
import com.webway.tournament.dto.FighterDto;
import com.webway.tournament.dto.TournamentDto;

public class TournamentMapper {

    public Fighter createFighterFromDto(FighterDto fighterDto) {
        Fighter fighter = new Fighter();
        fighter.setFighterName(fighterDto.getFighterName());
        fighter.setFighterAttack(fighterDto.getFighterAttack());
        fighter.setFighterDefence(fighterDto.getFighterDefence());
        fighter.setFighterHealth(fighterDto.getFighterHealth());
        fighter.setFighterStatus(fighterDto.getFighterStatus());
        return fighter;
    }

    public Tournament createTournamentFromDto(TournamentDto tourDto) {
        Tournament tour = new Tournament();
        tour.setTourId(tourDto.getTourId());
        tour.setTourName(tourDto.getTourName());
        tour.setTourStatus(tourDto.getTourStatus());
        return tour;
    }

    public TournamentDto createDtoFromTournament(Tournament t) {
        TournamentDto d = new TournamentDto();
        d.setTourId(t.getTourId());
        d.setTourName(t.getTourName());
        d.setTourStatus(t.getTourStatus());
        return d;
    }

}
