package guru.springframework.spring5webapp;

import java.util.HashMap;

public class Teste {

    public static void main(String[] args){
        HashMap<Integer, String> mapzao = new HashMap<>();
        mapzao.put(null, "ola");
        mapzao.put(1, "viva");

        System.out.println(mapzao.get(null)); // ola
        System.out.println(mapzao.get(1)); //viva
        System.out.println(mapzao.size()); //2

        mapzao.forEach((key, value) -> {
            System.out.println("Key : " + key + " Value : " + value);
        });
    }
}
