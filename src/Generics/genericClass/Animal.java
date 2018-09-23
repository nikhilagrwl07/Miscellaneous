package Generics.genericClass;

public class Animal
{
	private String name;
	
	public Animal() {
		//do nothing
	}

	public Animal(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s] Name: %s\n"
								, getClass().getName()
								, name);
	}
	
	@Override public boolean equals(Object o1) {
		if (o1 == null)
			return false;
		if (!(o1 instanceof Animal))
			return false;
		return (this.getName().equals(((Animal) o1).getName()));
	}
}
