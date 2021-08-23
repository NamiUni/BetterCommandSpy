/*
 * Copyright (c) 2020-2021 lokka30, All Rights Reserved. Use of this source code is governed by the GNU AGPL v3.0 license that can be found in BetterCommandSpy's LICENSE.md file.
 */

package me.lokka30.bettercommandspy.misc;

import me.lokka30.bettercommandspy.BetterCommandSpy;

/**
 * This enum is used for Utils#debugLog. It denotes which category
 * a debug message falls under so that it is easier to use, logging
 * only the information that the developer/support member is looking
 * for, rather than just an on/off switch for everything.
 *
 * @author lokka30
 * @see Utils#debugLog(BetterCommandSpy, DebugCategory, String)
 * @since v2.0.0
 */
public enum DebugCategory {

    /**
     * Reports when the spy status of a player is modified.
     *
     * @since v2.0.0
     */
    USER_HANDLER_STATUS_CHANGED,

    /**
     * Reports what the update checker is doing
     *
     * @since v2.0.0
     */
    UPDATE_CHECKER_OPERATIONS,

    /**
     * When a player joins the server and
     * BetterCommandSpy checks if they
     * should receive an update checker
     * notification, a debug message with
     * this category is sent to the console.
     *
     * @since v2.0.0
     */
    UPDATE_CHECKER_ON_JOIN_NOTIFY
}
