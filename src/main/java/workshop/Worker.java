package workshop;

import com.sun.deploy.security.BlacklistedCerts;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    public void doJob() {
        Tool pneumaticHammer = new Tool("młot pneumatyczny");
        Tool hammer = new Tool("młotek");
        Tool calliper = new Tool("suwmiarka");
        Tool screwdriver = new Tool("śrubokręt");
        Tool screwGun = new Tool("wkrętarka");

        List<Tool> myTools = new ArrayList<>();

        myTools.add(pneumaticHammer);
        myTools.add(hammer);
        myTools.add(calliper);
        myTools.add(screwdriver);
        myTools.add(screwGun);

        for (Tool t : myTools) {
            t.useTool();
        }

    }
}