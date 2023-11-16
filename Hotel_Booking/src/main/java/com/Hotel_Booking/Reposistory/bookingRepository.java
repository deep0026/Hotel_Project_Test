package com.Hotel_Booking.Reposistory;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hotel_Booking.entity.booking;
@Transactional
public interface bookingRepository extends JpaRepository<booking,Integer>{

}
