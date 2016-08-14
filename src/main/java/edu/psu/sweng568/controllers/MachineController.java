package edu.psu.sweng568.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Lists;

import edu.psu.sweng568.models.Machine;
import edu.psu.sweng568.services.MachineService;

@Controller
@RequestMapping("api/{version}/machines")
public class MachineController {
	@Autowired
	MachineService machineService;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Collection<Machine> getMachines()
	{
		Collection<Machine> machines = Lists.newArrayList(machineService.getAllMachines());
		return machines;
	}


	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Machine createMachine(@RequestBody Machine machine) {
		return machineService.saveMachine(machine);
	}
}
