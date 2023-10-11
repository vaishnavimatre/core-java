package jungle_book;

public class Game {

public static void main(String args[]) {
	Bear baloo = new Bear();
	baloo.name="baloo";
	baloo.sleep();
	baloo.honeydrink();
	baloo.hunt();
	baloo.walking();
	
	Human m= new Human();
	m.name="mowgli";
	m.sleep();
	m.talking();
	m.listening();
	
	Snake s = new Snake();
	s.name="kaa";
	s.drinking();
	s.bite();
	s.resting();
	s.eating();
	
	Tiger t = new Tiger();
	t.name="Shere khan";
	t.walking();
	t.hunt();
	t.running();
	t.sleep();
	
	Wolf w = new Wolf();
	w.name="Akela";
	w.walking();
	w.hunt();
	w.rest();
	w.eat();


}
}

