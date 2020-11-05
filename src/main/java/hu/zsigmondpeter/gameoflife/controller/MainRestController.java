package hu.zsigmondpeter.gameoflife.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.zsigmondpeter.gameoflife.entity.GameOfLife;
import hu.zsigmondpeter.gameoflife.service.GameOfLifeService;
import hu.zsigmondpeter.gameoflife.service.MainRestResponse;

@RestController
public class MainRestController
{
    @RequestMapping("/")
	public MainRestResponse index()
	{
		String[] listOfApis = {"/api/gameoflife"};
		return new MainRestResponse(listOfApis);
	}

	@PostMapping("/api/gameoflife")
	public GameOfLife gameOfLife(@RequestBody GameOfLife body)
	{
		return new GameOfLifeService(body).getNextStep();
	}
}
