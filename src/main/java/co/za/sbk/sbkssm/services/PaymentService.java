package co.za.sbk.sbkssm.services;

import co.za.sbk.sbkssm.domain.Payment;
import co.za.sbk.sbkssm.domain.PaymentEvent;
import co.za.sbk.sbkssm.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {

    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);
}
