package config;

public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("Max Players: " + configManager.getConfig("maxPlayers"));
        System.out.println("Default Language: " + configManager.getConfig("defaultLanguage"));
        System.out.println("Game Difficulty: " + configManager.getConfig("gameDifficulty"));
        
        System.out.println("\nAll Configuration Settings:");
        configManager.printAllConfigs();
    }
}