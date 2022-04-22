/*
 * Copyright (c) 2020-2021 lokka30, All Rights Reserved. Use of this source code is governed by the GNU AGPL v3.0 license that can be found in BetterCommandSpy's LICENSE.md file.
 */

package me.lokka30.bettercommandspy.commands;

import java.util.Collections;
import me.lokka30.bettercommandspy.BetterCommandSpy;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author lokka30
 * @since v2.0.0
 * <p>
 * This interface creates consistent methods used throughout all of the
 * subcommands this plugin provides - i.e., to run the subcommand, and
 * to calculate a list of tab suggestions.
 * This interface must only contain methods used by *all* subcommand classes.
 */
public interface Subcommand {

    /**
     * Run the subcommand.
     *
     * @param label label of the command (alias used). e.g., 'bcs' or 'commandspy' and so on.
     * @param args  all arguments supplied even with the base command, so this array also includes the subcommand itself.
     * @author lokka30
     * @since v2.0.0
     */
    void run(
        @NotNull BetterCommandSpy main,
        @NotNull CommandSender sender,
        @NotNull String label,
        @NotNull String[] args
    );

    /**
     * Get a list of tab suggestions.
     *
     * Only 1.13+ servers are able to utilise this feature.
     *
     * @param label label of the command (alias used). e.g., 'bcs' or 'commandspy' and so on.
     * @param args  all arguments supplied even with the base command, so this array also includes the subcommand itself.
     * @author lokka30
     * @since v2.0.0
     */
    @NotNull
    default List<String> getSuggestions(
        @NotNull BetterCommandSpy main,
        @NotNull CommandSender sender,
        @NotNull String label,
        @NotNull String[] args
    ) {
        return Collections.emptyList();
    }
}
