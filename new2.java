package assignement;
abstract class Instrument {
    public abstract void play();
}

class Piano extends Instrument {
    @Override
    public void play() {
        System.out.println("Piano is playing tan tan tan");
    }
}

class Flute extends Instrument {
    @Override
    public void play() {
        System.out.println("Flute is playing toot toot toot");
    }
}

class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}

public class new2 {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[10];


        for (int i = 0; i < instruments.length; i++) {
            if (i % 3 == 0) {
                instruments[i] = new Piano();
            } else if (i % 3 == 1) {
                instruments[i] = new Flute();
            } else {
                instruments[i] = new Guitar();
            }
        }


        for (int i = 0; i < instruments.length; i++) {
            System.out.print("At index " + i + ": ");
            if (instruments[i] instanceof Piano) {
                System.out.print("Piano object. ");
            } else if (instruments[i] instanceof Flute) {
                System.out.print("Flute object. ");
            } else if (instruments[i] instanceof Guitar) {
                System.out.print("Guitar object. ");
            } else {
                System.out.print("Unknown object. ");
            }
            instruments[i].play();
        }
    }
}
