package com.sample.shirt;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/shirts")
public class ShirtController {

	@GetMapping(value = "/getShirt")
	public Shirt getShirt(@RequestBody Shirt a) {
		return a;
	}

	@GetMapping(value = "/getBrand")
	public String getBrand(@RequestBody Shirt a) {
		return a.getBrand();
	}

	@GetMapping(value = "/getObj")
	public List<Shirt> getObj(@RequestBody List<Shirt> a) {
		return a;
	}

	@GetMapping(value = "/getOb")
	public List<Shirt> getOb(@RequestBody List<Shirt> a) {
		List<Shirt> getmax = a.stream().filter(x -> x.getPrice() > 1100).collect(Collectors.toList());
		return getmax;
	}

	@GetMapping(value = "/getObjj")
	public List<Shirt> getObjj(@RequestBody List<Shirt> a) {
		List<Shirt> m = a.stream().filter(x -> x.getPrice() > 1000 && x.getBrand().startsWith("o"))
				.collect(Collectors.toList());
		return m;
	}

	@GetMapping(value = "/getObjjj")
	public Shirt getObjjj(@RequestBody List<Shirt> a) {
		Shirt maxi = a.stream().max(Comparator.comparing(Shirt::getPrice)).get();
		return maxi;
	}

	@GetMapping(value = "/getOobj")
	public List<String> getOobj(@RequestBody List<Shirt> a) {
		List<String> mmaa = a.stream().filter(x -> x.getPrice() > 1100).map(x -> x.getBrand())
				.collect(Collectors.toList());
		return mmaa;
	}

	@GetMapping(value = "/getMaxLen")
	public Shirt getMaxLen(@RequestBody List<Shirt> a) {
		Shirt maxLen = a.stream().max(Comparator.comparing(Shirt::getBrand)).get();
		return maxLen;
	}
	
	
	@GetMapping(value="/getBr")
	public String getBr(@RequestBody List<Shirt> a) {
		String maxBr=a.stream().max(Comparator.comparingInt(x->x.getBrand().length())).map(x->x.getBrand()).get();
		return maxBr;
	}
}