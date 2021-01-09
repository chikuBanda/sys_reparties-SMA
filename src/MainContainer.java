import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.util.ExtendedProperties;
import jade.util.leap.Properties;
import jade.wrapper.AgentContainer;

public class MainContainer {
    public static void main(String[] args) {
        try {
            Runtime runtime = Runtime.instance();
            Properties properties = new ExtendedProperties();
            properties.setProperty("gui", "true");
            ProfileImpl profile = new ProfileImpl(properties);
            AgentContainer container = runtime.createMainContainer(profile);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
