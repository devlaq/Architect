package com.github.devlaq.arkitect.util

import arc.Core
import mindustry.mod.Mods
import mindustry.server.ServerControl

fun getServerControl(): ServerControl? {
    Core.app.listeners.forEach {
        if(it is ServerControl) {
            return it
        }
    }
    Logger("Arkitect").warn("Could not find ServerControl instance! (Is the plugin loaded in non-headless server?)")
    return null
}
