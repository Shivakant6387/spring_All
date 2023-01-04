                        config.xml

step1 create an interface 
step2 create a bean and implements interface and override interface methods
step3 create a bean and implements interface  and override interface methods
step4 create a bean and create a default constructor and create an argument constructor pass Interface name and object 
and create a method and pass dot method name
step5 create config.xml file and define bean id pass"argument" class pass"org.example.className "
step6 create second bean gives id "idName" class "org.example.className whom define argument constructors"
constructors-arg ref "bean id "
step7 go to main method inject dependencies ApplicationContext and object equal to new keyword ClassPathXmpApplication and pass(config.xml file)
step8 got to bean file and define object and equal to object types casting dot .getbean(bean Id)


                        class type inject bean
step1 create folder and create a class and define annotation @Configuration
create a method for interface name and object return your choose  and define @bean
create a method for where create a class of constructor and obj and called it new return  class of constructor and
pass obj where create private keyword and define annotation @bean pass name 

go to main method and ApplicationContext and obj equal to AnnotationConfigApplicationContext(pass class name)
where I was called a class and where define constructor and obj equal to object type casting  and obj dot getbean and pass beanId