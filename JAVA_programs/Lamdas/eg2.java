//now this code will not compile.
interface aaa
{
public void sam( );
public void tom( );
}
class main
{
public static void main(String gg[ ])
{
aaa a;
a=( )->{System.out.println("Very very very cool ferature");};
a.sam( );
}
};

//This is because the interface aaa is not a functional interface.
//Lamdas expression are only valid for functional interface.