/*
 * @fileoverview    {Application}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package io.flutter.plugins.notification;

import io.flutter.app.FlutterApplication;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.common.PluginRegistry.PluginRegistrantCallback;
import io.flutter.plugins.GeneratedPluginRegistrant;
import io.flutter.plugins.firebasemessaging.FirebaseMessagingPlugin;
import io.flutter.plugins.firebasemessaging.FlutterFirebaseMessagingService;

/**
 * TODO: Description of {@code Application}.
 *
 * @author Dyson Parra
 * @since 11
 */
public class Application extends FlutterApplication implements PluginRegistrantCallback {

    /**
     * TODO: Description of {@code onCreate}.
     *
     */
    @Override
    public void onCreate() {
        super.onCreate();
        FlutterFirebaseMessagingService.setPluginRegistrant(this);
    }

    /**
     * TODO: Description of {@code registerWith}.
     *
     */
    @Override
    public void registerWith(PluginRegistry registry) {
        FirebaseMessagingPlugin.registerWith(registry.registrarFor("io.flutter.plugins.firebasemessaging.FirebaseMessagingPlugin"));
    }
}
