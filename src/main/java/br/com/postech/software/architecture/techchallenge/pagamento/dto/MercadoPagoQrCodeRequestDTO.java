package br.com.postech.software.architecture.techchallenge.pagamento.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@Data
public class MercadoPagoQrCodeRequestDTO {

    //TODO validar parametros com MercadoPago
    private String userId;
    private String appId;
    private String caixaId;
    private BigDecimal value;
}
