package com.Hotel_Booking.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.transaction.Transactional;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Hotel_Booking.Service.bookingService;
import com.Hotel_Booking.Service.roomService;
import com.Hotel_Booking.entity.booking;
import com.Hotel_Booking.payload.bookingDto;
//bookingSer.bookingDetails(book);

@Controller
public class bookingController {
	@Autowired
	private roomService roomSer;
	@Autowired
	private bookingService bookingSer;
	@RequestMapping("/bookingDetails")
public String Booking(@RequestParam("roomId") int roomId ,Model model ,@RequestParam("userId") int userId) {
		model.addAttribute("roomId",roomId);
		model.addAttribute("userId",userId);
	return "bookingDetails";
}
	@Transactional
	@RequestMapping("/booking")
	public String bookingDetails(@RequestParam("checkInDate")@DateTimeFormat(pattern = "yyyy-MM-dd") Date checkIn,@RequestParam("checkOutDate")@DateTimeFormat(pattern = "yyyy-MM-dd") Date checkOut, @RequestParam("roomId") int roomId,
	@ModelAttribute booking book,Model model,@RequestParam("userId")int userId) {
		System.out.println(userId);
		 if (checkIn.before(checkOut)) {
			 model.addAttribute("Details",book);
			 model.addAttribute("userId",userId);
				return "confirmBooking";    
		 }
		 else {
			 model.addAttribute("alert","please enter valid date");
			model.addAttribute("roomId",roomId);
			model.addAttribute("userId",userId);
		 }
		 return "bookingDetails";
		
		 }
	@Transactional
	@RequestMapping("/confirmedRoom")
	public String confirmedBookings(@RequestParam("age")int age,@RequestParam("roomId")int roomid,
			@RequestParam("userId")int userid,@RequestParam("checkInDate")String checkInString,
			@RequestParam("checkOutDate") String checkOutString,@RequestParam("guestName")String guestname,
			@RequestParam("phone")String phone,@RequestParam("gender")String Gender) {
		roomSer.deleteRoom(roomid);
		bookingSer.bookingDetails(age, roomid, userid, checkInString, checkOutString, guestname, Gender,phone);
		
		return "confirmedRoom";

		}

}
