package components;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "greeting")
public class Greeting {

    private long id;
    private String content;

    public Greeting() {
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
    @XmlElement(name = "id")
    public long getId() {
        return id;
    }
    @XmlElement(name = "content")
    public String getContent() {
        return content;
    }
}

