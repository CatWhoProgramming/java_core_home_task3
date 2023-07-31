package Task2;

public class Main {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom();
        Pupil[] pupils = new Pupil[]{new GoodPupil(), new ExcellentPupil(), new BadPupil()};
        fillClassRoom(classRoom,pupils);
        classRoom.showInformationAboutPupils();
    }

    private static void fillClassRoom(ClassRoom classRoom,Pupil[] pupils) {

        int randomIndex;
        for (int i = 0; i < 4; i++) {
            randomIndex = (int) (Math.random() * 3);
            classRoom.pupils[i] = pupils[randomIndex];
        }
    }
}
