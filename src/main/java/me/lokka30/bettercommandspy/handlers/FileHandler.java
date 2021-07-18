package me.lokka30.bettercommandspy.handlers;

import me.lokka30.bettercommandspy.BetterCommandSpy;

/**
 * Handles file management (i.e. configs)
 *
 * @author lokka30
 * @since v2.0.0
 */
public class FileHandler {

    private final BetterCommandSpy main;

    public FileHandler(final BetterCommandSpy main) {
        this.main = main;
    }

    public enum Files {
        SETTINGS("settings.yml", 3),
        MESSAGES("messages.yml", 3),
        DATA("data.yml", 1),
        LICENSE("license.txt", -1);

        public final String fileName;
        public final int latestFileVersion; // -1 means that the file is not versioned.

        Files(String fileName, int latestFileVersion) {
            this.fileName = fileName;
            this.latestFileVersion = latestFileVersion;
        }
    }

    public void load() {
        //TODO
    }
}
