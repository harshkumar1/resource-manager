package edu.psu.sweng568.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.psu.sweng568.models.Machine;
import edu.psu.sweng568.repositories.MachineRepository;

@Service
public class MachineService {

	@Autowired
	private MachineRepository machineRepository;

	public Iterable<Machine> getAllMachines()
	{
		return machineRepository.findAll();
	}

	public Machine getMachineByHostname(Integer machineName)
	{
		return machineRepository.findOne(machineName);
	}

	public Machine saveMachine(Machine machine)
	{
		return machineRepository.save(machine);
	}
}
