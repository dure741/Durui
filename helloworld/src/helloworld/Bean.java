package helloworld;

public class Bean{
private String name;
private String No;
private String talk;
public static void main(String[] args)
{
	HelloWorldBean hello=new HelloWorldBean();
	System.out.println(hello.sayHello());
}
public String getName() {
	return name;
}
public String getTalk() {
	return talk;
}public String getNo() {
	return No;
}public void setName(String name) {
	this.name = name;
}public void setNo(String no) {
	No = no;
}public void setTalk(String talk) {
	this.talk = talk;
}
}