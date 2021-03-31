package br.com.udemy.cursomc.repositories;

import br.com.udemy.cursomc.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Objeto de acesso a dados
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
