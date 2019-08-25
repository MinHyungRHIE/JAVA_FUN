package javaLec.collection;
class Animal{
	private String animalName;
	
	Animal(String animalName){
		this.animalName = animalName;
	}

	public String getAnimalName() {
		return animalName;
	}
}

class Lion extends Animal{
	Lion(String animalName) {
		super(animalName);
	}}
class Monkey extends Animal{
	Monkey(String animalName) {
		super(animalName);
	}}
class Eagle extends Animal{
	Eagle(String animalName) {
		super(animalName);
	}}
