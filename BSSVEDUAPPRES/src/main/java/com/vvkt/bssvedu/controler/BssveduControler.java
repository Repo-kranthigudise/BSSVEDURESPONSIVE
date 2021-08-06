package com.vvkt.bssvedu.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BssveduControler {
	

	@GetMapping("/")
	public String homePage(Model model) {
		String msg = "FOR All INFORMATION +91-9849295916";
		model.addAttribute("message", msg);
		return "home";
	}

	@GetMapping("/courses")
	public String cources(Model model) {
		String msg = "COURSES";
		model.addAttribute("message", msg);
		return "courses";
	}

	@GetMapping("/photos")
	public String bssPhotos(Model model) {
		String msg = "PHOTOS";
		model.addAttribute("message", msg);
		return "photos";
	}

	@GetMapping("/contactus")
	public String contactUs(Model model) {
		String msg = "CONTACT US";
		model.addAttribute("message", msg);
		return "contactus";
	}


	@GetMapping("/alerts")
	public String fakeCertificate(Model model) {
		String msg = "FAKE CERIFICATE ALERTS";
		model.addAttribute("message", msg);
		return "alerts";
	}

	@GetMapping("/calert")
	public String publcOnNews(Model model) {
		String msg = "PUBLIC NOTICE ON NEWS PAPER";
		model.addAttribute("message", msg);
		return "publiconnews";
	}

	@GetMapping("/fakealert")
	public String cFakecertificate(Model model) {
		String msg = "FAKE CERTIFICATE & MARKSHEET";
		model.addAttribute("message", msg);
		return "fakealert";
	}

	@GetMapping("/jobs")
	public String bssJob(Model model) {
		String msg = "Congartulations for YourFeature:BSSVRDU JOBS";
		model.addAttribute("message", msg);
		return "job";
	}

	@GetMapping("/establish")
	public String bssAbout(Model model) {
		String msg = "ESTABLISH";
		model.addAttribute("message", msg);
		return "establish";
	}

	@GetMapping("/admin")
	public String bssInfo(Model model) {
		String msg = "ADMINISTRATION";
		model.addAttribute("message", msg);
		return "admin";
	}

	@GetMapping("/gvtat")
	public String gvtAttestation(Model model) {
		String msg = "GOVERNMENT ATTESTATION";
		model.addAttribute("message", msg);
		return "gvtattension";
	}

	@GetMapping("/works")
	public String bssWorks(Model model) {
		String msg = "BSSVEDU WORKS";
		model.addAttribute("message", msg);
		return "works";
	}


	
	
}
