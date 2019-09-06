package tws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tws.entity.PackageBean;
import tws.service.PackageService;

@CrossOrigin
@RestController
@RequestMapping("/packages")
public class PackageController {
	@Autowired
	private PackageService packageService;
	
	@GetMapping
	public ResponseEntity<List<PackageBean>> getAllPackages(){
		return ResponseEntity.ok(packageService.getAllPackages());
	}
	
	@PostMapping
	public ResponseEntity insertOnePackage(@RequestBody PackageBean packageBean){
		packageService.insertOnePackage(packageBean);
		return ResponseEntity.ok().build();
	}
}
