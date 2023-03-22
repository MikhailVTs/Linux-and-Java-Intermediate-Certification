import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Append_json {

    public static void main(String[] args) throws IOException {
        try {
            Scanner in = new Scanner(System.in);

            System.out.print("Введите Название игрушки: ");

            String toy_name = in.nextLine();

            JSONObject toysDetails = new JSONObject();
            toysDetails.put("id_toy", 1);
            toysDetails.put("name_toy", "teddy_bear");

            JSONObject toysObject = new JSONObject();
            toysObject.put("toys", toysDetails);

            JSONObject toysDetails_1 = new JSONObject();
            toysDetails_1.put("id_toy", 2);
            toysDetails_1.put("name_toy", "train");

            JSONObject toysObject_1 = new JSONObject();
            toysObject_1.put("toys", toysDetails_1);

            JSONObject toysDetails_2 = new JSONObject();
            toysDetails_2.put("id_toy", 3);
            toysDetails_2.put("name_toy", "rocket");

            JSONObject toysObject_2 = new JSONObject();
            toysObject_2.put("toys", toysDetails_2);

            Toys toys = new Toys(4, toy_name, 0, 0);

            JSONObject toysDetails_3 = new JSONObject();
            toysDetails_3.put("id_toy", toys.getId_toy());
            toysDetails_3.put("name_toy", toy_name);

            JSONObject toysObject_3 = new JSONObject();
            toysObject_3.put("toys", toysDetails_3);

            JSONArray toysList = new JSONArray();
            toysList.add(toysObject);
            toysList.add(toysObject_1);
            toysList.add(toysObject_2);
            toysList.add(toysObject_3);

            try (FileWriter file = new FileWriter("toys.json")) {

                file.write(toysList.toJSONString());
                file.flush();

            } catch (InputMismatchException ex) {
                ex.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}