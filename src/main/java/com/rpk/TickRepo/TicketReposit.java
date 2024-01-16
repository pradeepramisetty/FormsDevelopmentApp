package com.rpk.TickRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpk.TickBk.TickectsBooking;

public interface TicketReposit extends JpaRepository<TickectsBooking, Integer> {

}
