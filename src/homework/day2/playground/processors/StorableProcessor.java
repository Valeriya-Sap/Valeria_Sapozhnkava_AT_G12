package homework.day2.playground.processors;

import homework.day2.playground.essence.craft.hand.Storable;
import homework.day2.playground.essence.craft.material.Pourable;
import homework.day2.playground.utils.VolumeGenerator;

public class StorableProcessor {
    public void runStorable(Storable storable, Pourable pourable) {
        storable.store(pourable, VolumeGenerator.generateVolume(pourable));
    }

    public void runStorable(Storable storable, Pourable pourable, int volume) {
        storable.store(pourable, volume);
    }
}
