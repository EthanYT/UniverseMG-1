package com.Shadersoft.UniverseMG;

import com.Shadersoft.UniverseMG.Commands.*;
import com.Shadersoft.UniverseMG.Handlers.Handlerlist;
import java.util.HashMap;
import java.util.List;
import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class UniverseMG extends JavaPlugin {

    public static UniverseMG plugin;
    public FileConfiguration config;
    public String pluginName;
    public String pluginVersion;
    public List<String> pluginAuthors;
    public PluginDescriptionFile info;
    public HashMap<String, CommandExecutor> commandList = new HashMap();
    
    public Handlerlist handlers;

    @Override
    public void onEnable()
    {
        //Initialize Variables
        handlers = new Handlerlist();
        plugin = this;
        config = getConfig();
        info = getDescription();
        pluginName = info.getFullName();
        pluginVersion = info.getVersion();
        pluginAuthors = info.getAuthors();

        //Initialize Commands
        commandList.put("universemg", new Command_universemg());
        
        //Register Commands
        this.handlers.commandHandler.registerCommands(commandList);
        
        //Send Message
        System.out.println(pluginName + " version " + pluginVersion + " has been enabled!");
    }

    @Override
    public void onDisable()
    {
        System.out.println(pluginName + " version " + pluginVersion + " has been enabled!");
    }
}
