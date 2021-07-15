package designPattern_1;

public class User implements Observer{

    private String name;
    private Subject topic;

    public User(String name)
    {
        this.name = name;
    }
    @Override
    public void update()
    {
        String msg = (String) topic.getUpdate(this);
        if(msg == null)
        {
            System.out.println(name+":: Nici o notificare");
        }
        else
            System.out.println(name+":: Notificare primita::" + msg);
    }

    @Override
    public void setSubject(Subject sub)
    {
        this.topic = sub;
    }
}
