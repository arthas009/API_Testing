package Utility;

import org.yaml.snakeyaml.Yaml;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Map;

/**
 * YamlReader
 * This class is used to read configuration .yaml file
 */
public class YamlReader {
    static Map<String, Object> yamlMaps;

    public YamlReader(String path) {
        Yaml yaml = new Yaml();
        Reader yamlFile = null;
        try {
            yamlFile = new FileReader(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        yamlMaps = yaml.load(yamlFile);
    }

    /**
     * getVariable
     * Gets given variable from configuration file.
     *
     * @param varName: Variable to get.
     */
    public String getVariable(String varName) {
        return yamlMaps.get(varName).toString();
    }

}
