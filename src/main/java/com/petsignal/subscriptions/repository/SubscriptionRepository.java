package com.petsignal.subscriptions.repository;

import com.petsignal.alert.entity.AlertType;
import com.petsignal.subscriptions.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

  @Query("""
          SELECT s
          FROM Subscription s
          JOIN FETCH s.postCodes p
          WHERE (s.alertType = null OR s.alertType = :alertType)
            AND p.postalCode = :postalCode
            AND p.countryCode = :countryCode
      """)
  List<Subscription> findByAlertTypeAndPostalCodeAndCountryCode(AlertType alertType, String postalCode, String countryCode);
}
