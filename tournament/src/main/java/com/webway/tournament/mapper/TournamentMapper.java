package com.webway.tournament.mapper;

import com.webway.tournament.domain.Fighter;
import com.webway.tournament.dto.FighterDto;

public class TournamentMapper {

     public Fighter createFighterFromDto (FighterDto fighterDto){
         Fighter fighter = new Fighter();
         fighter.setFighterName(fighterDto.getFighterName());
         fighter.setFighterAttack(fighterDto.getFighterAttack());
         fighter.setFighterDefence(fighterDto.getFighterDefence());
         fighter.setFighterHealth(fighterDto.getFighterHealth());
         fighter.setFighterStatus(fighterDto.getFighterStatus());
         return fighter;
     }

}
