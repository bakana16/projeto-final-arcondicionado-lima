package br.senai.sistema.repository;

import br.senai.sistema.model.HistoricoStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricoStatusRepository extends JpaRepository<HistoricoStatus, Long> {
}