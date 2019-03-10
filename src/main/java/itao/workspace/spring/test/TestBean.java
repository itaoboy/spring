package itao.workspace.spring.test;

/**
 * @author itao
 * @create 2019-03-10 15:07
 */
public class TestBean {
    private String content;
    public TestBean(String content) {
        super();
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
