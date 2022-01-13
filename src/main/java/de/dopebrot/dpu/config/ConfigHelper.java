package de.dopebrot.dpu.config;

import de.dopebrot.dpu.math.MathHelper;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigHelper {

    // this class is all about configs

    public boolean checkConfig(String filePath) {
        File file = new File(filePath);
        return file.exists();
    }

    public void createFile(String filePath) throws IOException {
        File file = new File(filePath);
        boolean created = file.createNewFile();
        if (!created) {
            System.out.println("E> file could not created");
        }
    }

    public void setShort(String filePath, String valuePath, Short value) throws IOException {
        if (!checkConfig(filePath)) {
            createFile(filePath);
        }
        File file = new File(filePath);
        YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);
        yamlConfiguration.set(valuePath, value);
        yamlConfiguration.save(file);
    }

    public void setInteger(String filePath, String valuePath, Integer value) throws IOException {
        if (!checkConfig(filePath)) {
            createFile(filePath);
        }
        File file = new File(filePath);
        YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);
        yamlConfiguration.set(valuePath, value);
        yamlConfiguration.save(file);
    }

    public void setDouble(String filePath, String valuePath, Double value) throws IOException {
        if (!checkConfig(filePath)) {
            createFile(filePath);
        }
        File file = new File(filePath);
        YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);
        yamlConfiguration.set(valuePath, value);
        yamlConfiguration.save(file);
    }

    public void setFloat(String filePath, String valuePath, Float value) throws IOException {
        if (!checkConfig(filePath)) {
            createFile(filePath);
        }
        File file = new File(filePath);
        YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);
        yamlConfiguration.set(valuePath, value);
        yamlConfiguration.save(file);
    }


    public void setString(String filePath, String valuePath, String value) throws IOException {
        if (!checkConfig(filePath)) {
            createFile(filePath);
        }
        File file = new File(filePath);
        YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);
        yamlConfiguration.set(valuePath, value);
        yamlConfiguration.save(file);
    }

    public Short getShort(String filePath, String valuePath) throws IOException {
        if (!checkConfig(filePath)) {
            createFile(filePath);
        }
        File file = new File(filePath);
        YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);
        return (Short) new MathHelper().max((short) yamlConfiguration.getInt(valuePath), Short.MAX_VALUE);
    }

    public Integer getInteger(String filePath, String valuePath) throws IOException {
        if (!checkConfig(filePath)) {
            createFile(filePath);
        }
        File file = new File(filePath);
        YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);
        return yamlConfiguration.getInt(valuePath);
    }

    public Double getDouble(String filePath, String valuePath) throws IOException {
        if (!checkConfig(filePath)) {
            createFile(filePath);
        }
        File file = new File(filePath);
        YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);
        return yamlConfiguration.getDouble(valuePath);
    }

    public Float getFloat(String filePath, String valuePath) throws IOException {
        if (!checkConfig(filePath)) {
            createFile(filePath);
        }
        File file = new File(filePath);
        YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);
        return (Float) new MathHelper().max((float) yamlConfiguration.getDouble(valuePath), Float.MAX_VALUE);
    }


    public String getString(String filePath, String valuePath) throws IOException {
        if (!checkConfig(filePath)) {
            createFile(filePath);
        }
        File file = new File(filePath);
        YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);
        return yamlConfiguration.getString(valuePath);
    }





}
