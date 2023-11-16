package com.Hotel_Booking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Hotel_Booking.Service.roomService;
import com.Hotel_Booking.entity.Room;

@Controller
public class roomController {
	@Autowired
	private roomService roomSer;
	@RequestMapping("/showRoom")
public String rooms(Model model,@RequestParam("userId") int userId) {
	List<Room> rooms = roomSer.rooms();
	model.addAttribute("rooms",rooms);
	model.addAttribute("userId",userId);
	return "showRoom";
	
	
}
	@RequestMapping("/roomBooking")
	public String booking() {
		return "bookingDetails";
	}
}
