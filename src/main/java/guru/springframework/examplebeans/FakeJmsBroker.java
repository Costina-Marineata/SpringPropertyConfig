package guru.springframework.examplebeans;

public class FakeJmsBroker {
    String jmsUsername;
    String jmsPass;
    String jmsUrl;

    public String getJmsUsername() {
        return jmsUsername;
    }

    public void setJmsUsername(String jmsUsername) {
        this.jmsUsername = jmsUsername;
    }

    public String getJmsPass() {
        return jmsPass;
    }

    public void setJmsPass(String jmsPass) {
        this.jmsPass = jmsPass;
    }

    public String getJmsUrl() {
        return jmsUrl;
    }

    public void setJmsUrl(String jmsUrl) {
        this.jmsUrl = jmsUrl;
    }
}
