package tech.ada.pagamento.validator;

import org.springframework.stereotype.Component;
import tech.ada.pagamento.model.Pagamento;
import tech.ada.pagamento.model.SaldoInsuficienteException;
import tech.ada.pagamento.model.UsuarioSaldo;

@Component
public class PagamentoValidator {

    public void validarSaldo(Pagamento pagamento) {

        UsuarioSaldo usuarioSaldo = buscarSaldo(pagamento.getPagador());

        if (usuarioSaldo.getSaldo() < pagamento.getValor()) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o pagamento");
        }
    }

    private UsuarioSaldo buscarSaldo(String usuarioId) {

        return new UsuarioSaldo(usuarioId, "Usuário " + usuarioId, 1000.0);
    }

}
