package io.github.junhyeok.plugin

import org.bukkit.plugin.java.JavaPlugin

class PaperSamplePlugin: JavaPlugin() {
    override fun onEnable() {
        logger.info("HELLO WORLD")
    }
}