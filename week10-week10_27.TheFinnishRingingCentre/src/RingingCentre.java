/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evan
 */
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class RingingCentre {

    private Map<Bird, List<String>> observations;

    public RingingCentre() {
        this.observations = new HashMap<Bird, List<String>>();

    }

    public void observe(Bird bird, String place) {
        if (!observations.containsKey(bird)) {
            observations.put(bird, new ArrayList<String>());
        }
        observations.get(bird).add(place);
    }

    public void observations(Bird bird) {
        if (!observations.containsKey(bird)) {
            System.out.print(bird);
            System.out.println(" observations: 0");
            return;
        }
        System.out.print(bird);
        System.out.println(" observations: " + observations.get(bird).size());
        for (String location : observations.get(bird)) {
            System.out.println(location);
        }
    }
}
