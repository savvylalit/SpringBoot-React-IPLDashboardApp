package io.savvy.IplDashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.savvy.IplDashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>{

	Team findByTeamName(String teamName);
}
