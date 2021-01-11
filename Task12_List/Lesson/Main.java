package Task12_List.Lesson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Задача из лекции
 *
 * */
public class Main {
    public static void main(String[] args) {
        String textTemplate = "Здравствуйте, %s, у нас для вас специальное предложение!";

        UserProfile userProfile1 = new UserProfile("Иванов", "Иван","ivan777@yandex.ru");
        UserProfile userProfile2 = new UserProfile("Григорьева", "Оксана","oksi22331@gmail.com");
        UserProfile userProfile3 = new UserProfile("Ливанов", "Михаил","misha@yandex.ru");

        List<UserProfile> userProfiles = new ArrayList<>();
        userProfiles.add(userProfile1);
        userProfiles.add(userProfile2);
        userProfiles.add(userProfile3);

        List<Mail> emailList = new ArrayList<>();

        for (UserProfile userProfile: userProfiles) {
            Mail email = new Mail(userProfile.getEmail(), String.format(textTemplate, userProfile.getName()));
            emailList.add(email);
        }

        Iterator<Mail> emailListIterator = emailList.iterator();
        while (emailListIterator.hasNext()) {
            Mail email = emailListIterator.next();
            System.out.printf("%s\n\n", email);
        }
    }
}
