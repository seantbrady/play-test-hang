package com.avaje.ebeaninternal.server.lib;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Exists to work around this issue:
 *
 * https://github.com/rbygrave/avaje-ebeanorm-server/issues/4
 *
 * As luck would have it, Ebean tends to use package private fields, which allows us to do hacks like this without
 * using reflection.
 *
 * @author jroper
 */
public class EbeanShutdownHack {
    private static final Logger logger = Logger.getLogger(EbeanShutdownHack.class.getName());

    public static void shutdownAllActiveEbeanServers() {
        synchronized (ShutdownManager.runnables) {
            for (Runnable runnable: ShutdownManager.runnables) {
                try {
                    runnable.run();
                } catch (Exception ex) {
                    logger.log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                }

            }
            ShutdownManager.runnables.clear();
        }
    }
}