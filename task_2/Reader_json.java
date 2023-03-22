
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Reader_json {

    public static void main(String[] args) {

        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("toys.json")) {

            Object obj = jsonParser.parse(reader);

            JSONArray toysList = (JSONArray) obj;

            toysList.forEach(toysL -> parseEmployeeObject((JSONObject) toysL));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    private static void parseEmployeeObject(JSONObject toys) {

        JSONObject toysObject = (JSONObject) toys.get("toys");

        String name_toy = (String) toysObject.get("name_toy");

        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Изменить частоту выпадения призовой игрушки: ");
        int falling_out_toys = 1;
        try {
            falling_out_toys = input.nextInt();

        } catch (Exception e) {
            System.out.println("Будьте внимательней!");
        }

        Toys toy = new Toys(0, name_toy, 5, falling_out_toys);

        for (int i = 0; i < toy.getCount_toy(); i++) {
            num = (int) (Math.random() * 100);

            if (num <= toy.getCount_toy()) { // Шанс %
                System.out.println("Вы выйграли " + name_toy);
                File text = new File("Priz.txt");
                try {
                    PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(text, true)));
                    writer.println(name_toy);
                    writer.flush();
                    writer.close();
                } catch (Exception e) {

                }
            } else if (num <= 1) { // Шанс 1 %
                System.out.println("Попробуйте еще раз!");
            }

        }

    }
}