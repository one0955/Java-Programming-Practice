
public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class Mammal extends Animal{
	abstract String bark();
	
	abstract String getFood();
}

abstract class Reptile extends Animal{
	abstract String getFood();
}

class Cat extends Mammal{
	String name;
	float weight;
	String nameSlave;
	
	Cat(String name, float weight, String nameSlave) {
		super();
		this.name = name;
		this.weight = weight;
		this.nameSlave = nameSlave;
	}
	String bark() {
		System.out.println("Meow");
		return "Meow";
	}
	String getFood() {
		System.out.println("Fish");
		return "Fish";
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getNameSlave() {
		return nameSlave;
	}
	public void setNameSlave(String nameSlave) {
		this.nameSlave = nameSlave;
	}
	
}

class Dog extends Mammal{
	String name;
	float weight;
	String nameMaster;
	
	Dog(String name, float weight, String nameMaster) {
		super();
		this.name = name;
		this.weight = weight;
		this.nameMaster = nameMaster;
	}
	String bark() {
		System.out.println("Bowbow");
		return "Bowbow";
	}
	String getFood() {
		System.out.println("Apple");
		return "Apple";
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getNameMaster() {
		return nameMaster;
	}
	public void setNameMaster(String nameMaster) {
		this.nameMaster = nameMaster;
	}
	
}


class Crocodile extends Reptile{
	String name;
	float weight;
	
	public Crocodile(String name, float weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	String getFood() {
		System.out.println("Meat");
		return "Meat";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
}
