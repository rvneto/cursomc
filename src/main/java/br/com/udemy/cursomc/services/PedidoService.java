package br.com.udemy.cursomc.services;

import br.com.udemy.cursomc.domain.Pedido;
import br.com.udemy.cursomc.repositories.PedidoRepository;
import br.com.udemy.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido buscar(Integer id) {
        Optional<Pedido> pedido = pedidoRepository.findById(id); // busca a cliente pelo id
        return pedido.orElseThrow(
                () -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }
}
