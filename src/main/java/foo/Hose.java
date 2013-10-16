package foo;

public class Hose <E extends Hose> {
    E innerE;
    public E doStuff(E e, Hose<E> e2) {
	return e.getE();
    }
    
    public E getE(){
	return innerE;
    }

}



 