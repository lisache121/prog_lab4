public class Sceleton{
    protected String nameOfPart;

    //вложенные классы нестатические
    public class Arms {
        String nameOfPart = "руки";


        public String unclench() {
            return nameOfPart + " расжались ";
        }
        public String spreadOut(){
            return nameOfPart + " раскинуты";
        }
    }

    public class Head{

        String nameOfPart = "голова";

        public String dizzy(){
            return nameOfPart + " не кружится";
        }
    }

    public class Eyes{

        String nameOfPart = "глаза";

        public String close(){
            return nameOfPart + " закрыты";
        }
    }
}
