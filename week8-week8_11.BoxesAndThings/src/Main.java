public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);
        Box bix = new Box(10);

        box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box.add( new Book("Robert Martin", "Clean Code", 1) );
        box.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

        box.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        bix.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );
        Box crate = new Box(30);
        crate.add(box);
        crate.add(bix);
        System.out.println(crate);
        
        System.out.println( box );
    }
}