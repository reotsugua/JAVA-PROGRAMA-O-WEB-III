package tech.ada.pagamento.validator;

import org.springframework.stereotype.Component;
import tech.ada.pagamento.model.Pagamento;
import tech.ada.pagamento.model.Usuario;

import java.util.Map;

@Component
public class PagamentoValidator {

    private Map<String, Double> saldoUsuario;

    public void validarSaldo(Pagamento pagamento) {
        Double saldoPagador = saldoUsuario.get(pagamento.getPagador());
        if (saldoPagador == null || saldoPagador < pagamento.getValor()) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o pagamento");
        }
    }
}
