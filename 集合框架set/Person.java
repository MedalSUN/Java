package ���Ͽ��֮Set;


/*
 * Object��������ĳ��࣬�����࣬�����Ķ����м�����������Ҫ��дһ��
 * 1��toString��������    ���������Ĭ�Ϸ��ص��Ƕ�����������Ϣ���ַ�����ʽ������ʹ��Ĭ�ϵ�����£�������ʹ��===����.toString����������ֱ��д��
 * �������ͻ�Ĭ�ϵĵ���toString������===����������Ҫ��д������������ڲ��������ʽ�ı�һ�£�
 * 
 * 2��hashCode()����
 * 		���������HashSet���Ͽ�ܵ���Ҫ���裬���Ͽ�������洢�Ķ��������ɼ��Ͽ���е�hashcode��������������Ĺ�ϣֵ���������ڲ�
 * �ض��Ĵ洢��ʽ�����д洢��Object�����и���һ��Ĭ�ϵ�hashcode�����������Ĭ�ϵķ����޷����������ʱ�����Ҫ��д���hashcode�������������Լ�������
 * һ����������ϣֵ��ͬ���Ĵ洢��λ������ͬ�ģ��Դ����ж��Ƿ����ظ�¼������󣬵��ǣ�������Ĺ�ϣֵ��ͬ���Ƕ���ͬʱ
 * ������Ҫ�����equals������
 * 
 * 3��equals()����
 * 		��ǰ��Ĺ�ϣֵ����ͬ�ģ����Ƕ���ʵ�����ǲ�ͬ��ʱ�����Ҫ���д˷�����ʹ�ã������ᱻ�Զ�����ȥ�ж����������Ѿ��洢��ȥ�ľ�����ͬ��ϣֵ��
 * ���󵽵��ǲ�����ͬ�ģ��������ͬ�ģ��ڽ���hs.add(new Person("����",18));��add������ʱ��ͻᱨ����equals�������ص���һ��ture��ʱ��
 * ���ͻ��Զ���add�ɹ���������ص���false��ʱ������add���ɹ�
 * 
 * 
 * 
 * */




public class Person {
	
	String name;
	int age;
	

	public Person (String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	

	public String toString() {
		return name +"===="+age;
	}

	
	

	//��д����
	//hs.add(new Person("����",18));���ʱ�����hashcode����������
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode()+age;
	}

	//��д����
	//hashcode��ͬ��ô���ٵ���equals����
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		//System.out.println(name+"---�ұ�������");
		Person p = (Person) arg0;
		return p.name.equals(name) && age==p.age;
		//����ֵ��ture����folse
	}
	
}
