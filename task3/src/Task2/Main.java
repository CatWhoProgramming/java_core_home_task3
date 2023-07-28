package Task2;

public class Main {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(new GoodPupil());
        classRoom = new ClassRoom(new BadPupil(),new ExcellentPupil(),new GoodPupil());
         showAboutFirstPupilInformation(classRoom);
         showAboutSecondPupilInformation(classRoom);
         showAboutThirdPupilInformation(classRoom);
         showAboutFourthPupilInformation(classRoom);

    }

    private static void showAboutFirstPupilInformation(ClassRoom classRoom) {
        System.out.println("First pupil -----------------------------------");
        classRoom.pupil1.study();
        classRoom.pupil1.read();
        classRoom.pupil1.relax();
        classRoom.pupil1.write();
        System.out.println("--------------------------------------------------");
    }
    private static void showAboutSecondPupilInformation(ClassRoom classRoom) {
        System.out.println("Second pupil -----------------------------------");
        classRoom.pupil2.study();
        classRoom.pupil2.read();
        classRoom.pupil2.relax();
        classRoom.pupil2.write();
        System.out.println("--------------------------------------------------");
    }

    private static void showAboutThirdPupilInformation(ClassRoom classRoom) {
        System.out.println("Third pupil -----------------------------------");
        classRoom.pupil3.study();
        classRoom.pupil3.read();
        classRoom.pupil3.relax();
        classRoom.pupil3.write();
        System.out.println("--------------------------------------------------");
    }
    private static void showAboutFourthPupilInformation(ClassRoom classRoom) {
        System.out.println("Fourth pupil -----------------------------------");
        classRoom.pupil4.study();
        classRoom.pupil4.read();
        classRoom.pupil4.relax();
        classRoom.pupil4.write();
        System.out.println("--------------------------------------------------");
    }
}
