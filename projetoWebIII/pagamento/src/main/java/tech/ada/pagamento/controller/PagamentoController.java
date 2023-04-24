package tech.ada.pagamento.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tech.ada.pagamento.model.Comprovante;
import tech.ada.pagamento.model.Pagamento;
import tech.ada.pagamento.model.Usuario;
import tech.ada.pagamento.service.PagamentoService;
import tech.ada.pagamento.validator.PagamentoValidator;

@RestController
@RequestMapping("/pagamentos")
@Slf4j
public class PagamentoController {

    private PagamentoService service;
    private PagamentoValidator validator;

    public PagamentoController(PagamentoService service, PagamentoValidator validator) {
        this.service = service;
        this.validator = validator;
    }

    @PostMapping
    public Mono<Comprovante> pagar(@RequestBody Pagamento pagamento) {
        validator.validarSaldo(pagamento);
        return service.pagar(pagamento);
    }

}