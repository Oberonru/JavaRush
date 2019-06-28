package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = new File("C:\\projects\\ntext.txt");
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            user.setFirstName("Uasya");
            user.setLastName("Pupkin");
            Date currentdate = new Date(1987, 01, 12);
            user.setBirthDate(currentdate);
            user.setMale(true);
            user.setCountry(User.Country.RUSSIA);
            javaRush.users.add(user);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны


            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter printWriter = new PrintWriter(outputStream);
            for (User userItem : users) {
                printWriter.println(userItem.getFirstName());
                printWriter.println(userItem.getLastName());
                printWriter.println(userItem.getBirthDate());
                printWriter.println(userItem.isMale());
                printWriter.println(userItem.getCountry());
            }
            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            User user = new User();
            users = new ArrayList<>();
            while (reader.ready()) {
                user.setFirstName(reader.readLine());
                user.setLastName(reader.readLine());
                String dateString = reader.readLine();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
                Date date = simpleDateFormat.parse(dateString);
                user.setBirthDate(date);
                if (reader.readLine().equals("true")) {
                    user.setMale(true);
                }
                if (reader.readLine().equals("false")) {
                    user.setMale(false);
                }
                String s = reader.readLine();
                if (!reader.readLine().equals(null)) {
                    switch (s) {
                        case "Ukraine":
                            user.setCountry(User.Country.UKRAINE);
                            break;
                        case "Russia":
                            user.setCountry(User.Country.RUSSIA);
                        default:
                            user.setCountry(User.Country.OTHER);
                    }

                }
                users.add(user);
                reader.close();
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
