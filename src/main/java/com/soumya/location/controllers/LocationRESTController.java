package com.soumya.location.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soumya.location.entities.Location;
import com.soumya.location.repos.LocationRepository;

@RestController
@RequestMapping("/locations")
public class LocationRESTController {
	
	@Autowired
	LocationRepository locationRepository;
	
	@PostMapping
	public Location createLocation(@RequestBody Location location) {
		return locationRepository.save(location);
	}
	@PutMapping
	public Location updateLocation(@RequestBody Location location) {
		return locationRepository.save(location);

	}

	@DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable("id") int id) {
		locationRepository.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public Location getLocation(@PathVariable("id") int id) {
		return locationRepository.findById(id).get();

	}
	@GetMapping("/{id}")
	public java.util.List<Location> getLocation() {
		return locationRepository.findAll();
	}
}
