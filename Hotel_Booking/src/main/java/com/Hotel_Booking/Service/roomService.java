package com.Hotel_Booking.Service;

import java.util.List;

import com.Hotel_Booking.entity.Room;

public interface roomService {
public List<Room> rooms();
public void deleteRoom(int roomId);
}
