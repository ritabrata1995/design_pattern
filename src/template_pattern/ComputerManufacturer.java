package template_pattern;

public abstract class ComputerManufacturer {
	
	void buildComputer() {
		
		this.addHardDisk();
		this.addKeyBoard();
		this.addRam();
		
	}
	
	abstract void addHardDisk();
	abstract void addRam();
	abstract void addKeyBoard();

}
