import java.util.*;

class GoodsBogie {
    private String type;
    private String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() { return type; }
    public String getCargo() { return cargo; }
}

public class Main {
    public static void main(String[] args) {
        List<GoodsBogie> goodsTrain = new ArrayList<>();
        goodsTrain.add(new GoodsBogie("Box", "Coal"));
        goodsTrain.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsTrain.add(new GoodsBogie("Flat", "Steel"));

        // UC12: Safety Compliance Check using allMatch
        boolean isSafe = checkSafetyCompliance(goodsTrain);

        System.out.println("Train Safety Status: " + (isSafe ? "COMPLIANT ✅" : "UNSAFE ❌"));
    }

    public static boolean checkSafetyCompliance(List<GoodsBogie> bogies) {
        return bogies.stream().allMatch(bogie -> {
            // Rule: If type is Cylindrical, cargo MUST be Petroleum
            if (bogie.getType().equalsIgnoreCase("Cylindrical")) {
                return bogie.getCargo().equalsIgnoreCase("Petroleum");
            }
            return true; // Other bogie types are currently considered safe
        });
    }
}