package Task2;

public class BadPupil extends Pupil{
    @Override
    void read() {
        System.out.println("I can bad read");
    }

    @Override
    void study() {
        System.out.println("I can bad study");
    }

    @Override
    void write() {
        System.out.println("I can bad write");
    }

    @Override
    void relax() {
        System.out.println("I can bad relax");
    }
}
