package com.example.taxi_app_final.repository;

import com.example.taxi_app_final.model.Booking;
import com.example.taxi_app_final.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<Booking, String> {

    Optional<Booking> findById(Long id);
    void deleteById(Long id);
    List<Booking> findAllByUser(User user);

    List<Booking> findAllByDriver(User driver);

}
