import Lighting.Candelier;
import Lighting.Lamp;
import Lighting.LightingDevice;
import org.json.simple.parser.JSONParser;
import transport.Bus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<LightingDevice> lightingDevices = new TreeSet<>(new Comparator<LightingDevice>() {
            @Override
            public int compare(LightingDevice o1, LightingDevice o2) {
                return Integer.compare(o1.getPower(), o2.getPower());
            }
        });

        LightingDevice device = new LightingDevice(400) {
            @Override
            public double getEnergyConsumption() {
                return power * brightness;
            }
        };


        Lamp lamp1 = new Lamp(100);
        lamp1.setType(Lamp.Type.lED);


        ArrayList<Lamp> lamps = new ArrayList<>();
        lamps.add(new Lamp(100));
        lamps.add(new Lamp(20));
        lamps.add(new Lamp(40));
        lamps.add(new Lamp(150));

        Collections.sort(lamps);

        lamps.forEach(System.out::println);



//        for(Lamp lamp : lamps) {
//            System.out.println(lamp);
//        }

//        LightingDevice byon = new Candelier(10,5);

//        LocalDate getMoney = LocalDate.now();
//        LocalDate canGetMoney = LocalDate.from(getMoney).plusMonths(1);
//
//        System.out.println(canGetMoney);

//        Bus bus1 = new Bus(10.2);
//        Bus bus2 = new Bus(10.2);
//        System.out.println(bus1.equals(bus2));
//        System.out.println(bus1);
//        System.out.println(bus1.getEngine());

//        Bus bus1 = new Bus(10);
//        Bus bus2 = new Bus(22);
//        Bus eBus = new electroBus(22);
//
//        System.out.println(Bus.getCount());
//        System.out.println(electroBus.getCount());

//        TreeMap <String, Integer> good2count = new TreeMap<>();
////        Set<String> keys = good2count.keySet();
//        Scanner scanner = new Scanner(System.in);
//        for(;;) {
//            String goodName = scanner.nextLine();
//
//            if(goodName.equals("LIST")) {
//                printMap(good2count);
//                continue;
//            }
//
//            int count = 1;
//            if(good2count.containsKey(goodName)) {
//                count = good2count.get(goodName) + 1;
//            }
//                good2count.put(goodName, count);
//
//        }

//        ArrayList<String> list = new ArrayList<>(){{add ("красный");add("синий");add ("зеленый");}};
////        List<String> list = Arrays.asList("красный", "синий", "зеленый");
//        System.out.println("Перед сортировкой: " + list);
//        Collections.sort(list);
//        System.out.println("После сортировки: " + list);
//        Collections.sort(list, Collections.reverseOrder());
//        System.out.println("После обратной сортировки: " + list);


//        HashSet <String> set = new HashSet();
//        set.add("Первое");
//        set.add("Второре");
//        set.add("Третье");
//        set.add("Четвертое");
//
//        for (String temp : set){
//            System.out.println(temp);
//        }
//
//
//        ArrayList<String> list = new ArrayList(set);
//
//        for (String temp : list){
//            System.out.println(temp);
//        }
//
//        TreeSet<String> tree = new TreeSet(list);
//
//        ArrayList<String> formatList = new ArrayList(tree);
//
//        System.out.println("\n");
//        for (String temp : formatList) {
//            System.out.println(temp);
//        }

//        HashSet<String> words = new HashSet<>();
//        words.add("Первое");
//        words.add("Второе");
//        words.add("Третье");
//        words.add("Второе");
//
//        for(String word : words) {
//            System.out.println(word);
//        }

//        List list = new ArrayList(words);
//
//        for(String temp : list) {
//            System.out.println(word);
//        }

//        ArrayList<String> todoList = new ArrayList<>();
//        todoList.add("Первое дело");
//        todoList.add(0,"Второе дело");
//
////        for(int i =0; i < todoList.size(); i++)
//        for (String item : todoList)
//        {
//            System.out.println(item);
////            System.out.println(todoList.get(i));
//        }

//        float[] patientsTemperatures = new float[900];
//        for (float patientTemperature : patientsTemperatures) {
//            patientTemperature = (float) ((Math.random()*((40-32)))+32);
//           int tempTemperature = Math.round(patientTemperature*10);
//           float tempFloatTemperature = tempTemperature;
//           tempFloatTemperature = tempFloatTemperature/10;
//
//            System.out.println(patientTemperature + " - " + tempTemperature + " - " + tempFloatTemperature);
//        }

//        String text = "Everyone could notice that people often complain and say that it was better before. It may be a little nostalgia;\n" +
//                "the old people would like to return in the 50, forty years old people prefer the 70.\n" +
//                "It can be explained of the life period when they were younger. As its known people like their youth time.\n" +
//                "In general living is better now. We live when there arent as many wars in the world as before. And\n" +
//                "people live longer; the level of lifespan is higher than it was 40 years ago. People work less and they\n" +
//                "can afford to go to the vacation and buy more things.\n" +
//                "So, it is true that there is more pollution now than in the last century but there is more conveniences.\n" +
//                "Everyone has a shower, a TV, a fridge, a computer, etc. And now there are more means of communication\n" +
//                "than before. Earlier it was dangerous to travel and it was almost impossible to go around the world.\n" +
//                "Someone say that people were kinder before. But now people are more educated and now everyone has an\n" +
//                "opportunity to go to school and to get education. Its better to think of advantages to live in the\n" +
//                "modern world than to regret something that no longer exists.";
//
//        String regex = "[^a-zA-z\\s]";
//        String formatText = text.replaceAll(regex, "");
//        String[] words = formatText.split("\\s+");
//        StringBuilder formatWords = new StringBuilder();
//
//
//                for (String word: words) {
//                    formatWords.append(word).append(System.lineSeparator());
//                }
//        System.out.println(formatWords);


//                String text = "Due to this";
//                String textForSequent = text.strip().concat(" ");
//                String sequentialWordsNumbers = "";
//                int num = 0;
//                String word = "";
//
//                   for (int i = 0; i < textForSequent.length(); i++){
//
//                        if (textForSequent.charAt(i) != ' ') {
//
//                            word = word + textForSequent.charAt(i);
//                        }
//                         else { num++;
//                             sequentialWordsNumbers = sequentialWordsNumbers.concat("(" + num + ") ").concat(word).concat(" ");
//                             word = "";
//                        }
//                    }
//
//                System.out.println(sequentialWordsNumbers.strip());



        

//        String text = "1990 year";
//        char[] textChars = text.toCharArray();
//
//        for (char textChar : textChars) {
//            System.out.print(textChar + " - ");
//            if (Character.isDigit(textChar)) {
//                System.out.print("This is a digit \n");
//            } else {
//                System.out.print("This is not a digit \n");
//            }
//        }
//
//        for (int i = 0; i < textChars.length; i++) {
//            System.out.print(textChars[i] + " - ");
//            if (Character.isDigit(text.charAt(i))) {
//                System.out.print("This is a digit \n");
//            } else {
//                System.out.print("This is not a digit \n");
//            }
//
//        }



    }
//    private static void printMap(Map<String, Integer> map) {
////получение сета из Map        Set<String> keys = map.keySet();
//        for (String key : map.keySet()) {
//            System.out.println(key + " => " + map.get(key));
//        }
//    }

}