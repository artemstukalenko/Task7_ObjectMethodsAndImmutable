package task7_2;

import java.util.ArrayList;

public final class MixingConsole {
    final private int NUMBER_OF_CHANNELS;
    final private boolean HAS_DIGITAL_COMPONENTS;
    final private String MODEL;
    final private ArrayList <String> AVAILABLE_EFFECTS = new ArrayList <>();

    {
        AVAILABLE_EFFECTS.add("EQ");
        AVAILABLE_EFFECTS.add("Compression");
    }

    public MixingConsole(int numberOfChannels, String model,
                         boolean hasDigitalComponents) {
        NUMBER_OF_CHANNELS = numberOfChannels;
        HAS_DIGITAL_COMPONENTS = hasDigitalComponents;
        MODEL = model;
        addDigitalEffects();
    }

    private void addDigitalEffects() {
        if(HAS_DIGITAL_COMPONENTS) {
            AVAILABLE_EFFECTS.add("Reverb");
            AVAILABLE_EFFECTS.add("Delay");
        }
    }

    public int getNumberOfChannels() {
        return NUMBER_OF_CHANNELS;
    }

    public MixingConsole setNumberOfChannels(int numberOfChannels) {
        return new MixingConsole(numberOfChannels, this.MODEL,
                                 this.HAS_DIGITAL_COMPONENTS);
    }

    public String getModel() {
        return MODEL;
    }

    public MixingConsole setModel(String model) {
        return new MixingConsole(this.NUMBER_OF_CHANNELS, model,
                                 this.HAS_DIGITAL_COMPONENTS);
    }

    public boolean hasDigitalComponents() {
        return HAS_DIGITAL_COMPONENTS;
    }

    public MixingConsole setDigitalComponents(boolean hasDigitalComponents) {
        return new MixingConsole(this.NUMBER_OF_CHANNELS, this.MODEL,
                                 hasDigitalComponents);
    }

    public ArrayList <String> getAvailableEffects() {
        ArrayList <String> effects = new ArrayList<>();
        for(String s : AVAILABLE_EFFECTS) {
            effects.add(s);
        }
        return effects;
    }
}