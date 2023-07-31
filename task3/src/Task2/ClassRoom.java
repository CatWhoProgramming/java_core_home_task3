package Task2;

public class ClassRoom {
    protected Pupil[] pupils;

    ClassRoom() {
        this.pupils = new Pupil[4];
    }

    public void showInformationAboutPupils() {
        for (int i = 0; i < 4; i++) {
            System.out.println("----------------------------------------");
            this.pupils[i].study();
            this.pupils[i].read();
            this.pupils[i].write();
            this.pupils[i].relax();
        }
    }

}
