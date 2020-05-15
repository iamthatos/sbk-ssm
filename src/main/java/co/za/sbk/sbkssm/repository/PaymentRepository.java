package co.za.sbk.sbkssm.repository;

import co.za.sbk.sbkssm.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
