import java.util.List;

public class Main {

    public static void main(String args[]) {

        Controller controller =new Controller();
//        GameCharacter c1 = new GameCharacter("Reiner Bruan", 185, 95, 9, 7, 7, 10, 8);
//        GameCharacter c2 = new GameCharacter("Armin Alert", 163, 55, 2, 6, 10, 8, 8);
//        GameCharacter c3 = new GameCharacter("Annie Leonhart", 153, 54, 10, 7, 7, 3, 1);
//        GameCharacter c4 = new GameCharacter("Berthold Hoover", 192, 81, 9, 4, 6, 0, 2);
//        GameCharacter c5 = new GameCharacter("Jean Kristein", 175, 65, 9, 8, 7, 5, 9);
//        GameCharacter c6 = new GameCharacter("Sasha Blouse", 165, 55, 6, 3, 5, 6, 7);
//        GameCharacter c7 = new GameCharacter("Connie Springer", 158,58 ,6, 7,3  ,7 ,5 );
//        GameCharacter c8 = new GameCharacter("Mikasa Ackeman",170 ,68 ,10 ,9 ,8 ,6 ,7 );
//        GameCharacter c9 = new GameCharacter("Eren Yeager",170,63 ,9 ,10 , 3, 5, 10);
//        GameCharacter c10 = new GameCharacter("Historia Reiss", 145,42 ,4 ,8 ,7 ,6 ,5 );
//        GameCharacter c11 = new GameCharacter("Levi Ackerman",160 ,65 ,12 ,12 ,7 ,8 ,8 );
//        GameCharacter c12 = new GameCharacter("Erwin Smith",188 ,92 ,8 ,8 ,11 ,10 ,12 );
//        GameCharacter c13 = new GameCharacter("Hange Zoe",170 ,60 ,9 ,9 ,12 ,7 ,11 );
//
//
//        MyLinkedList<GameCharacter> list = new MyLinkedList<>();
//        list.add(c1);
//        list.add(c2);
//        list.add(c3);
//        list.add(c4);
//        list.add(c5);
//        list.add(c6);
//        list.add(c7);
//        list.add(c8);
//        list.add(c9);
//        list.add(c10);
//        list.add(c11);
//        list.add(c12);
//        list.add(c13);
//
//
//
//
//
//        for (int i = 0; i < list.getSize(); i++) {
//           controller.add(list.get(i));
//        }




        GameCharacter []gameCharacters=controller.getChracterArray();
        MyLinkedList<GameCharacter> mylist=new MyLinkedList<>();
        for(int i=0;i<gameCharacters.length;i++)
        {
            mylist.add(gameCharacters[i]);
        System.out.println(mylist.get(i).toString());
        }


    }
}
